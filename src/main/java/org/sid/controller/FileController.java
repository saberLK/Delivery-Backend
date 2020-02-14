package org.sid.controller;


import org.sid.entities.DBFile;
import org.sid.entities.Delivery;
import org.sid.services.DBFileStorageService;
import org.sid.services.DeliveryService;
import org.sid.util.UploadFileResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FileController {
@Autowired
private DeliveryService deliveryService;
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private DBFileStorageService DBFileStorageService;

    @PostMapping("/uploadFile/{id}")
    public void uploadFile(@RequestParam("file") MultipartFile file,@PathVariable Long id) {
        DBFile dbFile = DBFileStorageService.storeFile(file);
        Delivery d1  = deliveryService.findOne(id);
        d1.setFiles(dbFile);
deliveryService.addDelivery(d1);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(dbFile.getId())
                .toUriString();


    }

//    @PostMapping("/uploadMultipleFiles")
//    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
//        return Arrays.asList(files)
//                .stream()
//                .map(file -> uploadFile(file))
//                .collect(Collectors.toList());
//    }

    @GetMapping("/downloadFile/{id}")
    public ResponseEntity<Resource> downloadFile(@PathVariable Long id) {
        // Load file from database
       Delivery d1 = deliveryService.findOne(id);

       DBFile dbf = d1.getFiles();

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(dbf.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dbf.getFileName() + "\"")
                .body(new ByteArrayResource(dbf.getData()));
    }

}

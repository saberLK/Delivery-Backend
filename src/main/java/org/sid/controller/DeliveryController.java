package org.sid.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Delivery;
import org.sid.entities.Environement;

import org.sid.entities.Milestone;
import org.sid.entities.Projects;
import org.sid.repository.DeliveryRepository;
import org.sid.services.DeliveryService;
import org.sid.services.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class DeliveryController {

	@Autowired
	private DeliveryService deliveryService;
	@Autowired 
	private ProjectService projectService;
	@CrossOrigin
	@GetMapping(value="/deliveries")
	public List<Delivery> getAlldeliveries(){
		return deliveryService.getAlldeliveries();
	}
	
	@CrossOrigin
	@GetMapping(value="/deliveriesNull")
	public List<Delivery> getDeliveriesNull(){
		return deliveryService.getDeliveriesNull();
	}
	@CrossOrigin
	@PostMapping(value="/delivery")
	public Delivery addDelivery(@RequestBody Delivery delivery) {

		return deliveryService.addDelivery(delivery);
	}
	
	
	@CrossOrigin
	@DeleteMapping(value="/delivery/{id:.+}")
	public boolean deleteDelivery(@PathVariable Long id) {
		deliveryService.deleteDelivery(id);
		return true;
	}
	
	@CrossOrigin
	@GetMapping(value="/graph1")
	public HashMap<String,List<Delivery>> getGraph1(){
		return deliveryService.getGraph1();
	}
	@CrossOrigin
	@GetMapping(value="/nbrdel")
	public int getNumberofdel() {
		return deliveryService.getNumberofdel();
	}
	@CrossOrigin
	@GetMapping(value="/graphbar")
	public List<Projects> getGraph2(){
		return projectService.getAllProjects();
	}
	
	@CrossOrigin
	@GetMapping(value="/graphline/{id}/{mois}/{anne}")
	public int getGraph3(@PathVariable int id,@PathVariable int anne,@PathVariable int mois) {
		return deliveryService.getNumberLivraisonPerMonth(id, mois, anne);
	}
	
	@CrossOrigin
	@GetMapping(value="/line/{year}")
	public HashMap<String,Integer[]> line(@PathVariable int year){
		return deliveryService.getgraphline(year);
	}
	
	@CrossOrigin
	@PutMapping(value="/delivery/{id:.+}")
	public Delivery updateDelivery(@RequestBody Delivery delivery,@PathVariable Long id) {
		
	return deliveryService.updateDelivery(id,delivery);
	}
	
	@CrossOrigin
	@GetMapping(value="/delperpro/{id:.+}")
	public List<Delivery> getdelperpro(@PathVariable Long id){
		return deliveryService.getdelperpro(id);
	}
}

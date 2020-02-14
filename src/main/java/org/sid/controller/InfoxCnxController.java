package org.sid.controller;


import java.util.List;

import org.sid.entities.ApplicationConsole;
import org.sid.entities.ApplicationUnix;
import org.sid.entities.Base;
import org.sid.entities.Environement;
import org.sid.entities.Unix;
import org.sid.entities.Web;
import org.sid.services.AppConsoleService;
import org.sid.services.AppUnixService;
import org.sid.services.BaseService;
import org.sid.services.EnvironementService;
import org.sid.services.UnixService;
import org.sid.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoxCnxController {
@Autowired
private WebService webService;
@Autowired
private BaseService baseService;
@Autowired
private AppConsoleService appcsService;
@Autowired
private AppUnixService appuxService;
@Autowired
private UnixService unixService;
@Autowired
private EnvironementService environementService;
// Get all webs
@CrossOrigin
@GetMapping(value="/webs")
public List<Web> getAllweb() {
	
return webService.getAllWebs();
}

//Get web by id
//@CrossOrigin
//@GetMapping(value="/web/{id:.+}")
//public List<Web> getwebbyid(@PathVariable Long id) {
//	return webService.getWebById(id);
//}
@CrossOrigin
@GetMapping(value="/webenv/{id:.+}")
public Web getwebbyenv(@PathVariable Long id) {
	return webService.getwebbyenv(id);
}
@CrossOrigin
@GetMapping(value="/baseenv/{id:.+}")
public Base getbasebyenv(@PathVariable Long id) {
	return baseService.getbasebyenv(id);
}
@CrossOrigin
@GetMapping(value="/unixenv/{id:.+}")
public Unix getunixbyenv(@PathVariable Long id) {
	return unixService.getunixbyenv(id);
}
@CrossOrigin
@GetMapping(value="/appcsenv/{id:.+}")
public ApplicationConsole getappcsbyenv(@PathVariable Long id) {
	return appcsService.getappcsbyenv(id);
}
@CrossOrigin
@GetMapping(value="/appuxenv/{id:.+}")
public ApplicationUnix getappuxbyenv(@PathVariable Long id) {
	return appuxService.getappuxbyenv(id);
}
@CrossOrigin
@PutMapping(value="/environementweb/{id:.+}")
public Environement saveWebtoenv(@RequestBody Web web,@PathVariable Long id) {
	return environementService.addWebtoEnv(web, id);
}
@CrossOrigin
@PutMapping(value="/environementunix/{id:.+}")
public Environement saveUnixtoenv(@RequestBody Unix unix,@PathVariable Long id) {
	return environementService.addUnixtoEnv(unix, id);
}
@CrossOrigin
@PutMapping(value="/environementappcs/{id:.+}")
public Environement saveAppcstoenv(@RequestBody ApplicationConsole appcs,@PathVariable Long id) {
	return environementService.addAppcstoEnv(appcs, id);
}
@CrossOrigin
@PutMapping(value="/environementappux/{id:.+}")
public Environement saveAppuxtoenv(@RequestBody ApplicationUnix appux,@PathVariable Long id) {
	return environementService.addAppuxtoEnv(appux, id);
}
@CrossOrigin
@PutMapping(value="/environementbase/{id:.+}")
public Environement saveBasetoenv(@RequestBody Base base,@PathVariable Long id) {
	return environementService.addBasetoEnv(base,id);
}
//deleting web
@CrossOrigin
@DeleteMapping(value="/web/{id:.+}")
public boolean deleteWeb(@PathVariable Long id) {
	return webService.deleteWeb(id);
}

//saving a web
@CrossOrigin
@PostMapping(value="/web")
public Web saveWeb(@RequestBody Web web) {
	return webService.saveWeb(web);
}

//Updating  web 
@CrossOrigin
@PutMapping(value="/web/{id:.+}")
public Web updateweb(@RequestBody Web web,@PathVariable Long id) {
	
return webService.updateWeb(id,web);
}

///////////////////////////////////////BASE///////////////////////////////////////

//Get all Bases
@CrossOrigin
@GetMapping(value="/bases")
public List<Base> getAllBase() {
	
return baseService.getAllBase();
}

//Get base by id
//@CrossOrigin
//@GetMapping(value="/base/{id:.+}")
//public List<Base> getbasebyid(@PathVariable Long id) {
//	return baseService.getBaseById(id);
//}

//deleting base
@CrossOrigin
@DeleteMapping(value="/base/{id:.+}")
public boolean deleteBase(@PathVariable Long id) {
	return baseService.deleteBase(id);
}

//saving  base
@CrossOrigin
@PostMapping(value="/base")
public Base saveBase(@RequestBody Base base) {
	return baseService.saveBase(base);
}

//updating base
@CrossOrigin
@PutMapping(value="/base/{id:.+}")
public Base updatebase(@RequestBody Base base,@PathVariable Long id) {
	
return baseService.updateBase(id,base);
}


////////////////////////////////ApplicationUnix///////////////////////////

//Get all Application Unix	
@CrossOrigin
@GetMapping(value="/appuxs")
public List<ApplicationUnix> getAllAppux() {
	
return appuxService.getAllAppux();
}

//Get Application Unix by id
//@CrossOrigin
//@GetMapping(value="/appux/{id:.+}")
//public List<ApplicationUnix> getAppuxbyid(@PathVariable Long id) {
//	return appuxService.getAppuxById(id);
//}

//deleting Application Unix
@CrossOrigin
@DeleteMapping(value="/appux/{id:.+}")
public boolean deleteAppux(@PathVariable Long id) {
	return appuxService.deleteAppux(id);
}

//saving Application Unix
@CrossOrigin
@PostMapping(value="/appux")
public ApplicationUnix saveAppux(@RequestBody ApplicationUnix appux) {
	return appuxService.saveAppux(appux);
}

//updating Application Unix
@CrossOrigin
@PutMapping(value="/appux/{id:.+}")
public ApplicationUnix updateappux(@RequestBody ApplicationUnix appux,@PathVariable Long id) {
	
return appuxService.updateAppux(id,appux);
}


/////////////////////////////////////ApplicationConsole//////////////////////////

//Get all Application Console	
@CrossOrigin
@GetMapping(value="/appcss")
public List<ApplicationConsole> getAll() {
	
return appcsService.getAllAppcs();
}

//Get Application Console by id
//@CrossOrigin
//@GetMapping(value="/appcs/{id:.+}")
//public List<ApplicationConsole> getAppcsbyid(@PathVariable Long id) {
//	return appcsService.getAppcsById(id);
//}

//deleting Application Console
@CrossOrigin
@DeleteMapping(value="/appcs/{id:.+}")
public boolean deleteAppcs(@PathVariable Long id) {
	return appcsService.deleteAppcs(id);
}

//saving Application Console
@CrossOrigin
@PostMapping(value="/appcs")
public ApplicationConsole saveAppcs(@RequestBody ApplicationConsole appcs) {
	return appcsService.saveAppcs(appcs);
}

//updating Application Console
@CrossOrigin
@PutMapping(value="/appcs/{id:.+}")
public ApplicationConsole updateappcs(@RequestBody ApplicationConsole appcs,@PathVariable Long id) {
	
return appcsService.updateAppcs(id,appcs);
}

/////////////////Unix////////////////////////////////////////////////////////

//Get all Application Console	
@CrossOrigin
@GetMapping(value="/unixs")
public List<Unix> getAllUnix() {
	
return unixService.getAllUnix();
}

//Get Application Console by id
//@CrossOrigin
//@GetMapping(value="/unix/{id:.+}")
//public List<Unix> getUnixbyid(@PathVariable Long id) {
//	return unixService.getUnixById(id);
//}

//deleting Application Console
@CrossOrigin
@DeleteMapping(value="/unix/{id:.+}")
public boolean deleteUnix(@PathVariable Long id) {
	return unixService.deleteUnix(id);
}

//saving Application Console
@CrossOrigin
@PostMapping(value="/unix")
public Unix saveUnix(@RequestBody Unix unix) {
	return unixService.saveUnix(unix);
}

//updating Application Console
@CrossOrigin
@PutMapping(value="/unix/{id:.+}")
public Unix updateunix(@RequestBody Unix unix,@PathVariable Long id) {
	
return unixService.updateUnix(id,unix);
}
}



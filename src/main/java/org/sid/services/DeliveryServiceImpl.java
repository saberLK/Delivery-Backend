package org.sid.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


import org.sid.entities.DBFile;
import org.sid.entities.Delivery;
import org.sid.entities.Environement;
import org.sid.entities.Milestone;
import org.sid.entities.Projects;
import org.sid.entities.Web;
import org.sid.repository.DeliveryRepository;
import org.sid.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class DeliveryServiceImpl implements DeliveryService{
@Autowired
private DeliveryRepository deliveryRepository;
@Autowired
private ProjectRepository projectRepository;
@Autowired
private DBFileStorageService dBFileStorageService;
	@Override
	public List<Delivery> getAlldeliveries() {
	return deliveryRepository.findAll();
	}
	@Override
	public Delivery addDelivery(Delivery delivery) {
	return deliveryRepository.save(delivery);
	}
	@Override
	public boolean deleteDelivery(Long id) {
		deliveryRepository.delete(id);
		return true;
	}
	@Override
	public Delivery updateDelivery(Long id, Delivery delivery) {
Delivery d1 = deliveryRepository.findOne(id);
d1.setDate_creation(delivery.getDate_creation());
d1.setDate_livraison(delivery.getDate_livraison());
d1.setMilestones(delivery.getMilestones());
d1.setName(delivery.getName());
d1.setOwner(delivery.getOwner());
d1.setState(delivery.getState());
d1.setEnvironements(delivery.getEnvironements());
d1.setFiles(delivery.getFiles());
return deliveryRepository.save(d1);
	}
	@Override
	public List<Delivery> getDeliveriesNull() {
return deliveryRepository.getEDeliveriessNull();
	}
	@Override
	public HashMap<String, List<Delivery>> getGraph1() {
		HashMap<String, List<Delivery>> map = new HashMap<>();
List<Delivery> items = deliveryRepository.findAll();
		for (Delivery item : items) {
		    List<Delivery> itemsWithSameOwner = map.get(item.getOwner());
		    if (itemsWithSameOwner == null) { //does not exist in map yet
		    	itemsWithSameOwner = new ArrayList<Delivery>();
		        map.put(item.getOwner(), itemsWithSameOwner);
		    }
		    itemsWithSameOwner.add(item); //now add the item to the list for this key
		}
		return map;
	}
	@Override
	public List<Delivery> getdelperpro(Long id) {
	Projects p1 = projectRepository.findOne(id);
	return p1.getDeliveries();
	}
	@Override
	public List<Delivery> getdeliverynull() {
		return deliveryRepository.getEDeliveriessNull();
	}
	@Override
	public int getNumberofdel() {
	return deliveryRepository.findAll().size();
	}
	@Override
	public Delivery findOne(Long id) {
return deliveryRepository.findOne(id);
	}
	@Override
	public int getNumberLivraisonPerMonth(int id, int mois, int annee) {
		int nombreLivr = 0;
		Long i = new Long(id);
List<Delivery> ll = projectRepository.findOne(i).getDeliveries();
Calendar cal = Calendar.getInstance();

for(Delivery del : ll ) {
	cal.setTime(del.getDate_livraison());
		if(cal.get(Calendar.YEAR) == annee && cal.get(Calendar.MONTH) == mois) 
			nombreLivr++;
		System.out.println(cal.get(Calendar.MONTH));
}
	

		return nombreLivr;
	}
	@SuppressWarnings("unused")
	@Override
	public HashMap<String, Integer[]> getgraphline(int year) {
		//List<Delivery> itemsWithSameOwner = map.get(item.getOwner());
		//if (itemsWithSameOwner == null) { //does not exist in map yet
//			itemsWithSameOwner = new ArrayList<Delivery>();
//		    map.put(item.getOwner(), itemsWithSameOwner);
		//}
		//itemsWithSameOwner.add(item); //now add the item to the list for this key
//		HashMap<String,List<Integer>>  map = new HashMap<>();
//
//		List<Projects> allpro = projectRepository.findAll();
//
//
//		int nbrlivre =0;
//		String nomprojet = null;
//for(Projects project : allpro) {
//	List<Integer> lint = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0));
//		for(Delivery delivery : project.getDeliveries()) {
//			Calendar cal = Calendar.getInstance();
//			cal.setTime(delivery.getDate_livraison());
//			if(cal.get(Calendar.YEAR)==year) {
//
//				lint.add(cal.get(Calendar.MONTH), lint.get(cal.get(Calendar.MONTH))+1);
//
//			}
//	
//		}
//
//		map.put(project.getProject_name(), lint);
//}
		HashMap<String,Integer[]>  map = new HashMap<>();
		int count=0;
		List<Projects> projects = projectRepository.findAll();
		for (Projects projects2 : projects) {
			Integer []  lint= {0,0,0,0,0,0,0,0,0,0,0,0};
			for (Delivery delivery : projects2.getDeliveries()) {
			
				Calendar cal = Calendar.getInstance();
				cal.setTime(delivery.getDate_livraison());
				if(cal.get(Calendar.YEAR)==year) {
					for (int i=0;i<12;i++) {
						if(cal.get(Calendar.MONTH)==i) {
							count++;
							lint[i]=  lint[i] + count;
							System.err.println(cal.get(Calendar.MONTH));
							count=0;
						}
						
					}		
				}
				
			}
			map.put(projects2.getProject_name(),lint);
		}
	
		
		
				

		return map;
	}

	

	

		
	

	
	

}

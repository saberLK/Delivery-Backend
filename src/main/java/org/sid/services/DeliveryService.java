package org.sid.services;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.sid.entities.DBFile;
import org.sid.entities.Delivery;
import org.sid.entities.Environement;
import org.sid.entities.Milestone;
import org.sid.entities.Projects;
import org.springframework.web.multipart.MultipartFile;

public interface DeliveryService {
	public boolean deleteDelivery(Long id);
	public Delivery updateDelivery(Long id,Delivery delivery);
	public Delivery addDelivery(Delivery delivery);
	public List<Delivery >getAlldeliveries();
	
	public List<Delivery> getDeliveriesNull();
	public HashMap<String,List<Delivery>> getGraph1();
	public List<Delivery> getdelperpro(Long id);
	public List<Delivery> getdeliverynull();
	public int getNumberofdel();
	public Delivery findOne(Long id);
	public int getNumberLivraisonPerMonth(int id, int mois,int annee);
	public HashMap<String,Integer[]> getgraphline(int year);

}

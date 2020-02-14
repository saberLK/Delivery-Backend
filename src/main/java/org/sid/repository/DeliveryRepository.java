package org.sid.repository;

import java.util.HashMap;
import java.util.List;

import org.sid.entities.Delivery;
import org.sid.entities.Environement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
public Delivery findByname(String name);

@Query(value="SELECT d.* FROM delivery d where d.id_delivery NOT IN (select pd.deliveries_id_delivery from projects_deliveries pd)",nativeQuery=true)
public List<Delivery> getEDeliveriessNull();


}

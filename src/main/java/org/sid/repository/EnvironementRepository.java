package org.sid.repository;

import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.Environement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EnvironementRepository extends JpaRepository<Environement, Long>{
public Environement findBynomEnv(String nomenv);
@Query(value="SELECT e.* FROM environement e where e.id_environement NOT IN (select pe.environements_id_environement from projects_environements pe)",nativeQuery=true)
public List<Environement> getEnvironementsNull();
}

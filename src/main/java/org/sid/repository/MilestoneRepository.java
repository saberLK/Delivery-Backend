package org.sid.repository;

import java.util.List;

import org.sid.entities.Activity;
import org.sid.entities.Milestone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MilestoneRepository extends JpaRepository<Milestone, Long>{
public Milestone findByowner(String owner);
@Query(value="SELECT m.* FROM milestone m where m.id_milestone NOT IN (select dm.milestones_id_milestone from delivery_milestones dm)",nativeQuery=true)
public List<Milestone> getMilestonesNull();
}

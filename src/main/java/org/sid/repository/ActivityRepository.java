package org.sid.repository;

import java.util.List;

import org.sid.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long>{

	@Query(value="SELECT a.* FROM activity a where a.id_activity NOT IN (select ma.activities_id_activity from milestone_activities ma)",nativeQuery=true)
	public List<Activity> getActivitiesNull();
}

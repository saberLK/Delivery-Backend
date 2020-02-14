package org.sid.repository;

import org.sid.entities.ApplicationUnix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AppUnixRepository extends JpaRepository<ApplicationUnix, Long>{

}

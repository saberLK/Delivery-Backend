package org.sid.repository;

import org.sid.entities.Unix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnixRepository extends JpaRepository<Unix, Long>{

}

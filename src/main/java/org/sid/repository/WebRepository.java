package org.sid.repository;

import org.sid.entities.Web;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WebRepository extends JpaRepository<Web, Long> {
public Web findByUsername(String username);
}

package org.sid.repository;

import org.sid.entities.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VersionRepository extends JpaRepository<Version, Long>{
public Version findBynomVersion(String nomVersion);
}

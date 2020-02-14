package org.sid.repository;

import org.sid.entities.ApplicationConsole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppConsoleRepository extends JpaRepository<ApplicationConsole,Long  > {

}

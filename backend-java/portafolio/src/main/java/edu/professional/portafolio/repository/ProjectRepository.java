package edu.professional.portafolio.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;   
import edu.professional.portafolio.model.Projects;

@Repository
public interface ProjectRepository extends JpaRepository<Projects, Long> {
    
}

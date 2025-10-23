package edu.professional.portafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.professional.portafolio.model.Tecnologis;

@Repository
public interface TecnologiRepository extends JpaRepository<Tecnologis, Long>    {
    
}

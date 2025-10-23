package edu.professional.portafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.professional.portafolio.model.Evidences;

@Repository
public interface EvidenceRepository extends JpaRepository<Evidences, Long> {

    
}

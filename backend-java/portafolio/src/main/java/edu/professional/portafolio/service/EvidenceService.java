package edu.professional.portafolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.professional.portafolio.model.Evidences;
import edu.professional.portafolio.repository.EvidenceRepository;

@Service
public class EvidenceService {

    private final EvidenceRepository evidenceRepository;

    public EvidenceService(EvidenceRepository evidenceRepository) {
        this.evidenceRepository = evidenceRepository;
    }

    public List<Evidences> getAllEvidences() {
        return evidenceRepository.findAll();
    }

    public Evidences getEvidenceById(Long id) {
        return evidenceRepository.findById(id).orElse(null);
    }

    public Evidences createEvidence(Evidences evidence) {
        return evidenceRepository.save(evidence);
    }

    public void deleteEvidence(Long id) {
        evidenceRepository.deleteById(id);
    }
    
}

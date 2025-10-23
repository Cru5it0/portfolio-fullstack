package edu.professional.portafolio.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.professional.portafolio.service.EvidenceService;

@RestController
@RequestMapping("/api/evidences")
@CrossOrigin(origins = "*")
public class EvidenceController {

    private final EvidenceService evidenceService;

    public EvidenceController(EvidenceService evidenceService) {
        this.evidenceService = evidenceService;
    }
    
    @GetMapping
    public Object getAllEvidences() {
        return evidenceService.getAllEvidences();
    }
}

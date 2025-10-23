package edu.professional.portafolio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.professional.portafolio.model.Tecnologis;
import edu.professional.portafolio.service.TecnologiService;

@RestController
@RequestMapping("/api/tecnologis")
@CrossOrigin(origins = "*")
public class TecnologiController {

    private final TecnologiService tecnologiService;

    public TecnologiController(TecnologiService tecnologiService) {
        this.tecnologiService = tecnologiService;
    }

    @GetMapping
    public List<Tecnologis> getAllTecnologis() {
        return tecnologiService.getAllTecnologis();
    }
    
}

package edu.professional.portafolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.professional.portafolio.model.Tecnologis;
import edu.professional.portafolio.repository.TecnologiRepository;

@Service
public class TecnologiService {
    
    private final TecnologiRepository tecnologiRepository;

    public TecnologiService(TecnologiRepository tecnologiRepository) {
        this.tecnologiRepository = tecnologiRepository;
    }

    public List<Tecnologis> getAllTecnologis() {
        return tecnologiRepository.findAll();
    }

    public Tecnologis getTecnologiById(Long id) {
        return tecnologiRepository.findById(id).orElse(null);
    }

    public Tecnologis createTecnologi(Tecnologis tecnologi) {
        return tecnologiRepository.save(tecnologi);
    }

    public void deleteTecnologi(Long id) {
        tecnologiRepository.deleteById(id);
    }   

}

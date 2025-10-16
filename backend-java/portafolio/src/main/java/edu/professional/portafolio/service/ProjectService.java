package edu.professional.portafolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.professional.portafolio.model.Projects;
import edu.professional.portafolio.repository.ProjectRepository;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Projects> getAllProjects() {
        return projectRepository.findAll();
    }
    
    public Projects getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public Projects createProject(Projects project) {
        return projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
    
    
}

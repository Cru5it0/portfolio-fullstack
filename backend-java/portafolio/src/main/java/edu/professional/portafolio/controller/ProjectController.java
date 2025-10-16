package edu.professional.portafolio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.professional.portafolio.model.Projects;
import edu.professional.portafolio.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ProjectController {
    
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // Define endpoints here (e.g., GET, POST, DELETE)
    @GetMapping
    public List<Projects> getAllProjects() {
        return projectService.getAllProjects();
    }

}

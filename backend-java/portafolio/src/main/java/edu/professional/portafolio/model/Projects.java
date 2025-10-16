package edu.professional.portafolio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "projects")
@Data
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description_project;
    private String tech_stack;
    private String start_date;
    private String end_date;

}

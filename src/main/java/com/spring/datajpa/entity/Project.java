package com.spring.datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PROJECT")
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private Long projectId;
    private String projectName;

    @JsonIgnore
    @ManyToMany(mappedBy = "assignedProjects")
    private Set<Employee> employees = new HashSet<>();
}

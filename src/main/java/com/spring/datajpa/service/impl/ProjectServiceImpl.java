package com.spring.datajpa.service.impl;

import com.spring.datajpa.entity.Project;
import com.spring.datajpa.repository.ProductRepository;
import com.spring.datajpa.repository.ProjectRepository;
import com.spring.datajpa.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}

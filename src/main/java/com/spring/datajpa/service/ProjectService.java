package com.spring.datajpa.service;

import com.spring.datajpa.entity.Project;
import org.springframework.stereotype.Service;


public interface ProjectService {

    Project saveProject(Project project);
}

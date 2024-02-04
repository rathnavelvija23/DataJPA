package com.spring.datajpa.controller;

import com.spring.datajpa.entity.Employee;
import com.spring.datajpa.entity.Project;
import com.spring.datajpa.service.ProjectService;
import com.spring.datajpa.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProjectController {

    @Autowired
    ProjectServiceImpl projectServiceImpl;

    @PostMapping("/createProject")
    public Project createProject(@RequestBody Project project){

        return projectServiceImpl.saveProject(project);
    }



}

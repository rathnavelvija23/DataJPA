package com.spring.datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EMPLOYEE")
public class Employee {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name="emp_id")
    private Long empId;
    private String name;
    private Integer age;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name="emp_projects" ,
                joinColumns = @JoinColumn (name = "emp_id") ,
                inverseJoinColumns = @JoinColumn(name="project_id") )
    private Set<Project> assignedProjects = new HashSet<>();

    /* Employee -> id name Other column ||  Address -> add id and Emp id (as multiple column will be there)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_emp_id",referencedColumnName = "emp_id")
    private List<Address> address;

     */

    /* --> OnetoOne Mapping -- Bi-directional
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_add_id")
    private Address address;

Employee -> id name address_id(one to one) ||  Address -> add id and other column
     */


}

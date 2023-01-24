package com.example.intership.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_surname")
    private String studentSurname;

    @Column(name = "student_number")
    private String studentNumber;

    @JsonIgnore
    @OneToMany(mappedBy="student")
    private Set<Course> courses;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    private Contact contact;
}

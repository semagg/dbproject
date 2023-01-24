package com.example.intership.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_level")
    private String courseLevel;


    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;
}

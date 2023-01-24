package com.example.intership.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Long contactId;


    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "contact_pjone")
    private String contactPhone;

    @JsonIgnore
    @OneToOne(mappedBy = "contact")
    private Student student;


}

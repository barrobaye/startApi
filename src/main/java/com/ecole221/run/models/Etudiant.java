package com.ecole221.run.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, columnDefinition = "UUID default gen_random_uuid()")
    private UUID id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datedenaissance;
    private String phone;
    private File photo;
    @OneToMany(mappedBy = "etudiant")
    private List<Inscription> inscriptions;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classe_id")
    private Classes classes;


}

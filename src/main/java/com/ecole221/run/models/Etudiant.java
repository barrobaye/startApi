package com.ecole221.run.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
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
    private String matricule;
    private String adresse;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datedenaissance;
   /* @Min(18)
    @Max(30)
    private Integer age;*/
    private String phone;
    private File photo;
    @JsonIgnore
    @OneToMany(mappedBy = "etudiants")
    private List<Inscription> inscriptions;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classes classes;


}

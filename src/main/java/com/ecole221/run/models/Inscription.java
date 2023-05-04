package com.ecole221.run.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
 @Table(name="inscriptions")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String anneeScolaire;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datedinscription;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiants;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classe_id")
    private Classes classes;

}
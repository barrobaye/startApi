package com.ecole221.run.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name= "classes" )
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String libelle;
    private BigDecimal fraiInscription;
    private BigDecimal mensualite;
    private BigDecimal autreFrais;
    @JsonIgnore
    @OneToMany(mappedBy ="classes")
    private List<Etudiant> etudiants;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "filiere_id",referencedColumnName = "id")
    private Filiere filiere;

}

package com.ecole221.run.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="filieres")
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String libelle;
    @JsonIgnore
    @OneToMany(mappedBy ="filiere")
    private List<Classes> classes;
}

package com.ecole221.run.repository;

import com.ecole221.run.models.Classes;
import com.ecole221.run.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface EtudiantRepository extends JpaRepository <Etudiant, UUID> {
}

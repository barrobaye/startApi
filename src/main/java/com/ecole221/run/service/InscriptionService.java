package com.ecole221.run.service;

import com.ecole221.run.models.Classes;
import com.ecole221.run.models.Etudiant;
import com.ecole221.run.models.Inscription;
import com.ecole221.run.repository.ClassesRepository;
import com.ecole221.run.repository.EtudiantRepository;
import com.ecole221.run.repository.InscriptionRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Component
public class InscriptionService {
    private final InscriptionRepository inscriptionRepository;
    private final EtudiantRepository etudiantRepository;
    private final ClassesRepository classesRepository;

    public InscriptionService(InscriptionRepository inscriptionRepository, EtudiantRepository etudiantRepository, ClassesRepository classesRepository) {
        this.inscriptionRepository = inscriptionRepository;
        this.etudiantRepository = etudiantRepository;
        this.classesRepository = classesRepository;
    }

    public Inscription addInscription(@RequestBody Inscription inscription, UUID classe_id) {
        Classes classes = classesRepository.findById(classe_id).orElseThrow(() -> new EntityNotFoundException("filiere non trouvé"));
        String an = inscription.getAnneeScolaire();
        Etudiant etud = inscription.getEtudiants();
       List <Etudiant> student = etudiantRepository.findAll();
        for (Etudiant etudian : student){
            if (etudian.getInscriptions()==inscription.getEtudiants() && an == inscription.getAnneeScolaire()){
                log.info("etudiant déja inscris cette année");
            }
        }
        return inscriptionRepository.save(inscription);
    }

    public List<Inscription> getInscription() {
        return inscriptionRepository.findAll();
    }


}

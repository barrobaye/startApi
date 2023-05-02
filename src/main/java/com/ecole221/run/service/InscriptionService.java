package com.ecole221.run.service;

import com.ecole221.run.models.Filiere;
import com.ecole221.run.models.Inscription;
import com.ecole221.run.repository.InscriptionRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Component
public class InscriptionService {
    private final InscriptionRepository inscriptionRepository;

    public InscriptionService(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }
    public Inscription addInscription(@RequestBody Inscription inscription){
        /* addCommandeToDetailCommande(commande);*/
        return inscriptionRepository.save(inscription);
    }

    public List<Inscription> getInscription(){
        return inscriptionRepository.findAll();
    }
}

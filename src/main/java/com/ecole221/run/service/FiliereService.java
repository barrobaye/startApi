package com.ecole221.run.service;

import com.ecole221.run.models.Etudiant;
import com.ecole221.run.models.Filiere;
import com.ecole221.run.repository.FiliereRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class FiliereService {
    private final FiliereRepository filiereRepository;

    public FiliereService(FiliereRepository filiereRepository) {
        this.filiereRepository = filiereRepository;
    }
    public Filiere addFiliere(@RequestBody Filiere filiere){
        /* addCommandeToDetailCommande(commande);*/
        return filiereRepository.save(filiere);
    }

    public List<Filiere> getFilieres(){
        return filiereRepository.findAll();
    }
}

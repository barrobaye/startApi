package com.ecole221.run.service;

import com.ecole221.run.models.Etudiant;
import com.ecole221.run.repository.EtudiantRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class EtudiantService {
    private final EtudiantRepository etudiantRepository;

    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }
    public Etudiant addEtudiant(@RequestBody Etudiant commande){
       /* addCommandeToDetailCommande(commande);*/
        return etudiantRepository.save(commande);
    }

    public List<Etudiant> getEtudiants(){
        return etudiantRepository.findAll();
    }
}

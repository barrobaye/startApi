package com.ecole221.run.service;

import com.ecole221.run.models.Classes;
import com.ecole221.run.repository.ClassesRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Component
public class ClasseService {
    private final ClassesRepository classesRepository;
    private final FiliereService filiereService;

    public ClasseService(ClassesRepository classesRepository, FiliereService filiereService) {
        this.classesRepository = classesRepository;
        this.filiereService = filiereService;
    }
    public Classes addClasses(@RequestBody Classes classes){
        /* addCommandeToDetailCommande(commande);*/
        return classesRepository.save(classes);
    }

    public List<Classes> getClasses(){
        return classesRepository.findAll();
    }
}

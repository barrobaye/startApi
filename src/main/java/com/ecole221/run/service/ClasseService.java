package com.ecole221.run.service;

import com.ecole221.run.models.Classes;
import com.ecole221.run.models.Filiere;
import com.ecole221.run.repository.ClassesRepository;
import com.ecole221.run.repository.FiliereRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Component
public class ClasseService {
    private final ClassesRepository classesRepository;
    private final FiliereRepository filiereRepository;

    public ClasseService(ClassesRepository classesRepository, FiliereRepository filiereRepository) {
        this.classesRepository = classesRepository;
        this.filiereRepository = filiereRepository;
    }
    public Classes addClasses(@RequestBody Classes classes , UUID filiere_id){
        Filiere filiere = filiereRepository.findById(filiere_id).orElseThrow(() -> new EntityNotFoundException("filiere non trouvé"));
        classes.setFiliere(filiere);
        return classesRepository.save(classes);
    }

    public List<Classes> getClasses(){
        return classesRepository.findAll();
    }
}

package com.ecole221.run.controller;

import com.ecole221.run.models.Etudiant;
import com.ecole221.run.models.Filiere;
import com.ecole221.run.service.FiliereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/filiere" )
@RestController
public class FiliereController {
    private final FiliereService filiereService;

    public FiliereController(FiliereService filiereService) {
        this.filiereService = filiereService;
    }
    @PostMapping
    public Filiere save(@RequestBody Filiere filiere){
        return filiereService.addFiliere(filiere);
    }
    @GetMapping
    public List<Filiere> findAll(){
        return filiereService.getFilieres();
    }
}

package com.ecole221.run.controller;

import com.ecole221.run.models.Etudiant;
import com.ecole221.run.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/etudiant" )
@RestController
public class EtudiantController {
    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }
    @PostMapping
    public Etudiant save(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }
    @GetMapping
    public List<Etudiant>findAll(){
        return etudiantService.getEtudiants();
    }
}

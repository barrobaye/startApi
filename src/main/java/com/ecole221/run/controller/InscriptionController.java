package com.ecole221.run.controller;

import com.ecole221.run.models.Inscription;
import com.ecole221.run.service.InscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping(value = "/inscription")
@RestController
public class InscriptionController {

    private final InscriptionService inscriptionService;

    public InscriptionController(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }

    @PostMapping
    public Inscription save(@RequestBody Inscription inscription, UUID classe_id){
        return inscriptionService.addInscription(inscription,classe_id);
    }
    @GetMapping
    public List<Inscription> findAll(){
        return inscriptionService.getInscription();
    }
}

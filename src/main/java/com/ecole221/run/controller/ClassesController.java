package com.ecole221.run.controller;

import com.ecole221.run.models.Classes;
import com.ecole221.run.models.Filiere;
import com.ecole221.run.models.Inscription;
import com.ecole221.run.service.ClasseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping(value = "/classe" )
@RestController
public class ClassesController {
    private final ClasseService classeService;
    public ClassesController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @PostMapping
    public Classes save(@RequestBody Classes classes,UUID filiere_id) {
        return classeService.addClasses(classes,filiere_id);
    }

    @GetMapping
    public List<Classes> findAll() {
        return classeService.getClasses();
    }
}

package com.ecole221.run.controller;

import com.ecole221.run.models.Classes;
import com.ecole221.run.models.Etudiant;
import com.ecole221.run.models.Inscription;
import com.ecole221.run.service.ClasseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/classe" )
@RestController
public class ClassesController {
    private final ClasseService classeService;

    public ClassesController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @PostMapping
    public Classes save(@RequestBody Classes classes) {
        return classeService.addClasses(classes);
    }

    @GetMapping
    public List<Classes> findAll() {
        return classeService.getClasses();
    }
}

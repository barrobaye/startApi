package com.ecole221.run.models;

import jakarta.persistence.Entity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AnneeScolaire {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datedebut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datefin;
}

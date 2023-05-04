package com.ecole221.run.repository;

import com.ecole221.run.models.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClassesRepository  extends JpaRepository<Classes , UUID> {
}

package org.example.labo03.repositories;

import org.example.labo03.domain.entities.Specimen;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface SpecimenRepository extends JpaRepository<Specimen, UUID> {
}
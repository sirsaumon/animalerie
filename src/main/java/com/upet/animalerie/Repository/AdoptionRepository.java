package com.upet.animalerie.Repository;

import com.upet.animalerie.Entities.AdoptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptionRepository extends JpaRepository<AdoptionEntity, Integer> {
}

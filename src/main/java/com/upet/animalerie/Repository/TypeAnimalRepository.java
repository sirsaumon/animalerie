package com.upet.animalerie.Repository;

import com.upet.animalerie.Entities.TypeAnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAnimalRepository extends JpaRepository<TypeAnimalEntity, Integer> {
}

package com.upet.animalerie.Repository;

import com.upet.animalerie.Entities.TypeUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeUserRepository extends JpaRepository<TypeUserEntity, Integer> {
}

package com.upet.animalerie.Services;

import com.upet.animalerie.DTO.AnimalDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public interface AnimalService {

    void add(String name, Integer espece, Integer diponibilite, Integer sexe, Integer age, String vendeur, String adresseImage);

    List<AnimalDTO> getAll();

    AnimalDTO getByID(Integer id);

    boolean updateDispo(Integer id, Integer dispo);
}

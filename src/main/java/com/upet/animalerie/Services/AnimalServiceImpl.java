package com.upet.animalerie.Services;

import com.upet.animalerie.DTO.AnimalDTO;
import com.upet.animalerie.Entities.AnimalEntity;
import com.upet.animalerie.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public void add(String name, Integer espece, Integer diponibilite, Integer sexe, Integer age) {
        AnimalEntity entity = new AnimalEntity();
        entity.setName(name);
        entity.setId_type_espece(espece);
        entity.setDisponibilite(diponibilite);
        entity.setSexe(sexe);
        entity.setAge(age);
        animalRepository.save(entity);

    }

    @Override
    public List<AnimalDTO> getAll()
    {
        return animalRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public AnimalDTO getByID(Integer id) {
        if(!animalRepository.findById(id).isPresent()){
            return null;
        } else
        {
            AnimalEntity animalEntity = animalRepository.findById(id).get();
            AnimalDTO animalDTO = this.entityToDto(animalEntity);
            return animalDTO;
        }
    }

    @Override
    public boolean updateDispo(Integer id, Integer dispo) {
        if(!animalRepository.findById(id).isPresent()){
            return false;
        } else{
            AnimalEntity animal = animalRepository.findById(id).get();
            animal.setDisponibilite(dispo);
            animalRepository.save(animal);
            return true;
        }
    }

    private AnimalDTO entityToDto(AnimalEntity animalEntity) {
        AnimalDTO animalDTO = new AnimalDTO();
        animalDTO.setName(animalEntity.getName());
        animalDTO.setEspece(animalEntity.getId_type_espece());
        animalDTO.setDiponibilite(animalEntity.getDisponibilite());
        animalDTO.setSexe(animalEntity.getSexe());
        animalDTO.setAge(animalEntity.getAge());
        animalDTO.setVendeur(animalEntity.getId_vendeur());
        return animalDTO;
    }



}


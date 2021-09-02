package com.upet.animalerie.Controller;


import com.upet.animalerie.DTO.AnimalDTO;
import com.upet.animalerie.Repository.TypeAnimalRepository;
import com.upet.animalerie.Services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Vendeur")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    //Methode Add pour ajouter un vendeur
    @PutMapping("Add")
    public Boolean create(@RequestParam String name, @RequestParam String espece, @RequestParam Integer diponibilite, @RequestParam Integer sexe, @RequestParam Integer age) {
        try {
            Integer esp = Integer.parseInt(espece);
            animalService.add(name, esp, diponibilite, sexe, age);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Methode All permettant de recuperer tous les animaux
    @GetMapping("All")
    public List<AnimalDTO> getAll() {
        return animalService.getAll();
    }

    // Methode GetByID permettant de recuperer un animal de la table en fonction de son ID
    @GetMapping("GetByID/{ID}")
    public String getByID(@PathVariable Integer ID) {
        return animalService.getByID(ID);
    }

}

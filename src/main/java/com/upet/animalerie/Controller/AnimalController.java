package com.upet.animalerie.Controller;


import com.upet.animalerie.DTO.AnimalDTO;
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
    public Boolean create(@RequestParam String name, @RequestParam Integer espece, @RequestParam Integer diponibilite, @RequestParam Integer sexe, @RequestParam Integer age) {
        try {
            animalService.add(name, espece, diponibilite, sexe, age);
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

}
package com.upet.animalerie.Controller;

import com.upet.animalerie.Entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Auth")
public class AuthController {
    /*@Autowired
    private UserRepository repositorie;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("exist")
    public String userExist(@RequestParam String email) {
        UserEntity user = repositorie
        /*if (user != null){
            return "il existe";
        }
        else {
            return "il existe pas";
        }
        return "isExist";
    }*/

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("register")
    public String registerNewUser(@RequestParam String nom, @RequestParam String prenom, @RequestParam String type) {
        if (type == "acheteur") {

        }
        else if (type == "vendeur"){

        }
        return "success";
    }
}

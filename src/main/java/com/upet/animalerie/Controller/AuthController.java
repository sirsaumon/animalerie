package com.upet.animalerie.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Auth")
public class AuthController {

    /*@Autowired
    private User user;*/
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("exist")
    public String userExist(@RequestParam String email) {
        /*if (user != null){
            return "il existe";
        }
        else {
            return "il existe pas";
        }*/
        return "isExist";
    }
}

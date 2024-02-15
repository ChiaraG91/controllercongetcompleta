package com.controllerccongetcompleta.ControllerconGETcompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HomeController {

    @GetMapping("/ciao/{provincia}")
    public User question(@PathVariable String provincia, @RequestParam String nome) {
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new User(nome,provincia,saluto);
    }
}
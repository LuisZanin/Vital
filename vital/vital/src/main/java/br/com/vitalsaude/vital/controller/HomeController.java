package br.com.vitalsaude.vital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Olá, aqui não está seguro!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Olá, aqui está seguro!";
    }

}

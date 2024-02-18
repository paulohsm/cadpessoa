package com.github.paulohsm.cadpessoa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping
    public String getPessoa(){
        return "Uma frase que tu queira.";
    }
}

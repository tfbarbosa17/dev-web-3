package br.edu.ifpr.lista_exercicios_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/", "/exercicio1"})
public class HelloWorld {

    @GetMapping
    public String hello(){
        return "Olá mundo";

 }




}

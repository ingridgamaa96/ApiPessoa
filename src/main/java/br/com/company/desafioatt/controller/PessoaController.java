package br.com.company.desafioatt.controller;


//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.Mapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/pessoas")
//public class PessoaController {
//    @GetMapping
//    public String getInfo(){
//        return "testando controller";
//    }
//}


import br.com.company.desafioatt.modelo.Pessoa;
import br.com.company.desafioatt.repository.PessoaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> listar(){
       return pessoaRepository.findAll();
    }
}
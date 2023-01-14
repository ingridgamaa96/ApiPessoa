package br.com.company.desafioatt.controller;


import br.com.company.desafioatt.model.Pessoa;
import br.com.company.desafioatt.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/pessoas")
public class PessoaController {


    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/listar")
    public List<Pessoa> listar(){
       return pessoaRepository.findAll();
    }

    @PostMapping
    public Pessoa adicionar(@RequestBody Pessoa pessoa){
       return pessoaRepository.save(pessoa);
    }

}
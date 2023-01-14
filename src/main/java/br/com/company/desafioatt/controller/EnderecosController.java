package br.com.company.desafioatt.controller;

import br.com.company.desafioatt.model.Enderecos;
import br.com.company.desafioatt.repository.EnderecosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/enderecos")
public class EnderecosController {


    @Autowired
    private EnderecosRepository enderecosRepository;

    @GetMapping
    public List<Enderecos> listar(){
        return enderecosRepository.findAll();
        //endereço principal ?
    }
    @PostMapping
    public Enderecos adicionar(@RequestBody Enderecos enderecos){
        return enderecosRepository.save(enderecos);

    }

}


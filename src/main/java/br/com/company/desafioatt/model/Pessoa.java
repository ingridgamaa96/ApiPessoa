package br.com.company.desafioatt.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, Enderecos enderecos, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.ender = enderecos;
        this.dataNascimento = dataNascimento;
    }
    private String nome ;
    @Column(nullable = false)
    private String enderecos;
    private LocalDate dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(String enderecos) {
        this.enderecos = enderecos;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}

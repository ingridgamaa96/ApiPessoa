package br.com.company.desafioatt.repository;

import br.com.company.desafioatt.modelo.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <Pessoa, Long >{
}

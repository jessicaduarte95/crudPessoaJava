package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping("/pessoa")
    public Pessoa salvarPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @GetMapping("/pessoa")
    public List<Pessoa> buscarTodas(){
        return pessoaRepository.findAll();
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa getPessoaById(@PathVariable Long id){
        return pessoaRepository.findById(id).get();
    }

    @DeleteMapping("/pessoa/{id}")
    public void deletarPessoa(@PathVariable Long id){

        pessoaRepository.deleteById(id);
    }
}

package com.example.crud;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Pessoa {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;

    public Pessoa(){
        super();
    }
    public Pessoa(Long id, String nome, String cpf){
        super();
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa(String nome, String cpf){
        super();
        this.nome = nome;
        this.cpf = cpf;
    }

}

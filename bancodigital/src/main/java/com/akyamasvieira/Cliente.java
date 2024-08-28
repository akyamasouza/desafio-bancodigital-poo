package com.akyamasvieira;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}

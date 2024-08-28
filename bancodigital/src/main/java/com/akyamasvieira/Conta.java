package com.akyamasvieira;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {
    private double saldo;
    private String numero;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return String.format("Número: %s - Saldo: R$ %.2f", numero, saldo);
    }
}

package com.akyamasvieira;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaPoupanca {
    private Conta conta;
    private Cliente cliente;

    public ContaPoupanca(Cliente cliente, String numero, double saldoInicial) {
        this.cliente = cliente;
        this.conta = new Conta();
        this.conta.setNumero(numero);
        this.conta.setSaldo(saldoInicial);
    }

    public void depositar(double valor) {
        conta.depositar(valor);
    }

    public void sacar(double valor) {
        conta.sacar(valor);
    }

    public void transferir(double valor, ContaPoupanca destino) {
        conta.transferir(valor, destino.getConta());
    }

    @Override
    public String toString() {
        return String.format("Conta Poupança de %s (Número: %s) - Saldo: R$ %.2f",
                cliente.getNome(), conta.getNumero(), conta.getSaldo());
    }
}

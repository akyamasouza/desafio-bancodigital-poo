package com.akyamasvieira;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        ContaCorrente cc1 = new ContaCorrente(cliente1, "12345", 1000);
        ContaPoupanca cp1 = new ContaPoupanca(cliente2, "67890", 500);

        cc1.depositar(200);
        cp1.sacar(50);
        cc1.transferir(100, new ContaCorrente(new Cliente("Charlie"), "67891", 200));

        System.out.println(cc1);
        System.out.println(cp1);
    }
}

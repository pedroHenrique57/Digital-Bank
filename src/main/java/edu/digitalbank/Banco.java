package edu.digitalbank;

import java.util.ArrayList;

import edu.digitalbank.tiposClientes.ClientePadrao;

public class Banco {
    public static void main(String[] args) {
        ArrayList<ClientePadrao> clientes = new ArrayList<>();

        clientes.add(new ClientePadrao("Renato"));

        clientes.get(0).contaCorrente.deposito(15);
        clientes.get(0).contaCorrente.saque(5);
        clientes.get(0).contaCorrente.transferencia(clientes.get(0).ContaPoupanca, 5);

        System.out.println(clientes.get(0));
    }
}
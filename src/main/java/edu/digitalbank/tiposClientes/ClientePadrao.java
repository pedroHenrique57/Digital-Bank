package edu.digitalbank.tiposClientes;

import edu.digitalbank.tiposContas.ContaCorrente;
import edu.digitalbank.tiposContas.ContaPoupanca;
import lombok.ToString;

@ToString

public class ClientePadrao {

  public ClientePadrao(String nome) {
    this.nome = nome;
  }

  private String nome;
  public ContaCorrente contaCorrente = new ContaCorrente();
  public ContaPoupanca ContaPoupanca = new ContaPoupanca();
}

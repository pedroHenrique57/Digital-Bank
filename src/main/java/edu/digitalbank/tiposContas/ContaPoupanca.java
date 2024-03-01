package edu.digitalbank.tiposContas;

import lombok.ToString;

@ToString

public class ContaPoupanca implements conta {
  private int saldo = 0;

  @Override
  public void deposito( int valor) {
    saldo += valor;
  }

  @Override
  public void saque(int valor) {
    saldo -= valor;
  }

  @Override
  public void transferencia(conta contaDestino, int valor) {
    contaDestino.deposito(valor);
    saldo -= valor;
  }
}

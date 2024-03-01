package edu.digitalbank.tiposContas;

public interface conta {

  public void deposito(int valor);

  public void saque(int valor);

  public void transferencia(conta contaDestino, int valor);

}

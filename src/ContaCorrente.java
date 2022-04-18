public class ContaCorrente extends Conta implements Tributavel {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public void deposita(double valor) {
    this.saldo += valor;
  }

  @Override
  public void saca(double valor) throws SaldoInsuficienteException {
    super.saca(valor + 0.2);
  }

  @Override
  public double getValorImposto() {
    return super.getSaldo() * PorcentagemTributo.NORMAL.getValor();
  }
}

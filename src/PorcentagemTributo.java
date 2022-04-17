public enum PorcentagemTributo {
  MIN(0.01),
  NORMAL(0.1),
  MAX(1);

  public double getValor() {
    return valor;
  }

  private final double valor;

  PorcentagemTributo(double valor) {
    this.valor = valor;
  }
}

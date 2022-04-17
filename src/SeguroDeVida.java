public class SeguroDeVida implements Tributavel {
  @Override
  public double getValorImposto() {
    return 42 * PorcentagemTributo.MAX.getValor();
  }
}

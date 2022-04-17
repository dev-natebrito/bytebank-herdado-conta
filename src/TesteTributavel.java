public class TesteTributavel {
  public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente(222, 333);
    contaCorrente.deposita(1000);

    SeguroDeVida seguroDeVida = new SeguroDeVida();
    CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
    calculadorDeImposto.registra(contaCorrente);
    calculadorDeImposto.registra(seguroDeVida);
    System.out.printf("O valor total do imposto é de %s%n", calculadorDeImposto.getTotalImposto());
  }
}

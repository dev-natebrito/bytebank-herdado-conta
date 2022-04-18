public class TesteContas {
  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(111, 111);
    cc.deposita(100.0);

    ContaPoupanca cp = new ContaPoupanca(222, 222);
    cp.deposita(200.0);

    try {
      cc.transfere(10, cp);
    } catch (SaldoInsuficienteException e) {
      System.out.println(e.getMessage());
    }
    try {
      cc.saca(300);
    } catch (SaldoInsuficienteException e) {
      System.out.println(e.getMessage());
    }
    System.out.printf("CC saldo: %s, CP saldo: %s%n", cc.getSaldo(), cp.getSaldo());
  }
}

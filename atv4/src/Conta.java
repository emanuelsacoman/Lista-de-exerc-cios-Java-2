public class Conta {
    private double saldo;
        public Conta (double saldoInicial) {
            if (saldoInicial > 0.0)
                saldo = saldoInicial;
            else
                saldo = 0.0;
            }
            public double getSaldo() {
                return saldo;
            }
            public void creditar (double quantia) {
                saldo += quantia;
            }
             // insira aqui o método debitar

            public void debitar (double quantia){
                if (quantia > saldo){
                    System.out.println("Quantia de débito excedeu o saldo da conta.");
                }else {
                    saldo -= quantia;
                }
            }
    }
    
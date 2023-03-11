import java.util.*;
public class UsaConta
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Conta conta1 = new Conta (1000.00);
        Conta conta2 = new Conta (150.00);
        /* exibe o saldo inicial de cada objeto */
        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.print("Digite o valor de retirada da conta1: ");
        double qtdeRetirada1 = scanner.nextDouble(); // quantidade retirada lida a partir do usuario
        // apresenta a quantidade retirada
        System.out.printf("Subtraindo %.2f do saldo da conta1\n\n", qtdeRetirada1);
        /* insira aqui a chamada ao método debitar do objeto conta1 enviando como parâmetro qtdeRetirada1*/

        conta1.debitar(qtdeRetirada1);

        //exibe os saldos
        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.print("Digite o valor de retirada da conta2: ");
        double qtdeRetirada2 = scanner.nextDouble();
        // apresenta a quantidade retirada
        System.out.printf("Subtraindo %.2f do saldo da conta1\n\n", qtdeRetirada2);
        /* insira aqui a chamada ao método debito do objeto conta2 enviando como parâmetro qtdeRetirada2*/

        conta2.debitar(qtdeRetirada2);

        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());
    }
}

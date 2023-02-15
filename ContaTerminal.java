import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank sistemaBancario = new bank();
        char resp1, resp2;
        double deposito;
        System.out.println("digite o numero da agencia: ");
        sistemaBancario.agencia = sc.next();
        System.out.println("digite o numero da conta: ");
        sistemaBancario.numeroConta = sc.nextInt();
        System.out.println("digite o nome do cliente:  ");
        sistemaBancario.nomeUsuario = sc.next();

        System.out.println("saldo inicial: " + sistemaBancario.getSaldo());
        System.out.println("Deseja fazer deposito inicial? (s/n): ");
        resp1 = sc.next().charAt(0);
        if (resp1 == 's') {
            System.out.println("quantidade a ser depositada:  ");
            deposito = sc.nextDouble();
             sistemaBancario.depositoInicial(deposito, sistemaBancario.saldo);
            System.out.println("Conta criada com sucesso!\n");
            System.out.println("========================");

        } else {
            System.out.println("CONTA CRIADA COM SUCESSO");
            System.out.println("========================");

        }
        System.out.println("DADOS DA CONTA: ");
        System.out.println(sistemaBancario.toString());
    }
}
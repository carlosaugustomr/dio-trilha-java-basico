/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package contabanco;

import java.util.Scanner;

class ContaBancaria {
    private int numeroConta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numeroConta, int agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirDados() {
        System.out.println("Olá, " + nomeCliente + "!");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}

public class DioTrilhaJavaBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco Dio");

        int numeroConta = 0;
        int agencia = 0;
        String nomeCliente = "";
        double saldo = 0.0;

        try {
            System.out.print("Digite o número da conta: ");
            numeroConta = scanner.nextInt();

            System.out.print("Digite a agência: ");
            agencia = scanner.nextInt();

            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            System.out.print("Digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();

            System.out.print("Digite o saldo: ");
            saldo = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados. Por favor, tente novamente.");
            return;
        }

        ContaBancaria conta = new ContaBancaria(numeroConta, agencia, nomeCliente, saldo);
        conta.exibirDados();

        // Aqui você pode adicionar mais lógica, como operações bancárias, etc.

        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorbanco2;
import java.util.Scanner;

/**
 *
 * @autor Matheus Brito Martins Moreira
 */
public class SimuladorBanco2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria Scanner para o código guardar informações do usuário
        double saldo = 1000.0; // Cria a variável "saldo" em tipo Double porque pode tem vírgula
        
        try {
            System.out.println("=== Simulador de Atendimento Bancário ==="); // Mostra todos os "println" sequenciais na tela
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar atendimento");
            System.out.print("Escolha uma opção: "); // Mostra este "print" sozinho na tela
            int opcao = sc.nextInt(); // Cria a variável int "opcao"

            switch (opcao) { // Escolhe um dos cases
                case 1 -> System.out.println("Seu saldo é: R$ " + saldo); // Usa a variável "saldo" do começo que já tem 1000 reais
                case 2 -> {
                    System.out.print("Digite o valor para saque: "); // Input
                    double saque = sc.nextDouble(); // Cria a variável Double "saque" e guarda
                    if (saque > saldo) { // Se o valor tirado for mais de 1000
                        System.out.println("Erro: saldo insuficiente!"); // Então mostre que é impossível
                    } else {
                        saldo -= saque; // Conta de subtração
                        System.out.println("Saque realizado. Novo saldo: R$ " + saldo); // Mostre o novo saldo depois do saque
                    }
                }
                case 3 -> {
                    System.out.print("Digite o valor para depósito: "); // Mostra na tela a única mensagem
                    double deposito = sc.nextDouble(); // Cria variável Double "deposito"
                    saldo += deposito; // Variável "deposito" adiciona mais valor à variável "saldo"
                    System.out.println("Depósito realizado. Novo saldo: R$ " + saldo); // Mostra a escrita e coloca o novo valor da variável "saldo"
                }
                case 4 -> System.out.println("Atendimento encerrado."); // Encerra o atendimento
                default -> System.out.println("Opção inválida!"); // Se for input de Double errado
            }

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!"); // Se nem for input de Double
        } finally { // Sempre será executado ao final
            System.out.println("Obrigado por usar nosso banco."); // Conclusão do serviço
            sc.close(); // Para de gastar memória guardando Inputs
        }
    }
}
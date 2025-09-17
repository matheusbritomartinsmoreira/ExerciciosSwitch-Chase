/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarifastransporte2;

import java.util.Scanner; //Importa para usar o Scanner
/**
 *
 * @autor Matheus Brito Martins Moreira
 */

public class TarifasTransporte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Para capturar o que o usuário digitar.
 // Visualização das opções de bilhetes
        try { // Vai rodar em "try" se o valor for de 1 a 4
            System.out.println("====Calculadora de Tarifas de Transporte===="); // Com o "println", todos os "println" em seguida são mostrados em uma mensagem só ao usuário.
            System.out.println("1 - Ônibus urbano (R$ 4,40)");
            System.out.println("2 - Metrô (R$ 5,00)");
            System.out.println("3 - Trem intermunicipal (R$ 6,50)");
            System.out.println("4 - Ônibus rodoviário (R$ 12,00)");
 // Usuário escolhe(Input) um bilhete
            System.out.print("Digite o tipo de transporte: "); // Agora, só "print" o usuário vê uma única mensagem na tela.
            int opcao = sc.nextInt(); // Espera o usuário digitar um inteiro no teclado. Valor foi guardado dentro da variável "opcao". Agora "opcao" tem o número que o usuário escolher.
 // Usuário escolhe(Input) quantidade de bilhetes
            System.out.print("Digite a quantidade de bilhetes: "); // Aparece a mensagem única na tela
            int quantidade = sc.nextInt(); // Variável "quantidade" criada. Guardará quantia de bilhetes que o usuário quis.

            double total = 0; // Criada variável "total" tipo double. Porque o total de preços pode ter centavos.
 // Código decide qual case é usado e faz a conta
            switch (opcao) {
                case 1 -> total = quantidade * 4.40; // Usa a variável Int "quantidade", multiplica pelo valor e dá o "total" tipo Double(pois tem vírgula)
                case 2 -> total = quantidade * 5.00;
                case 3 -> total = quantidade * 6.50;
                case 4 -> total = quantidade * 12.00;
                default -> { // Se você digitar um valor "int" fora de 1 a 4.
                    System.out.println("Opção inválida!"); // Mostra ao usuário que deu errado
                    return; // Sai do programa
                }
            }

            System.out.println("Valor total da compra: R$ " + total); // Mostra na tela a escrita "Valor total..." e o preço

        } catch (Exception e) { // Pega o valor se for fora de "Int". (Não está nem em "try" e muito menos "default")
            System.out.println("Erro: você digitou um valor inválido!"); // Mostra que o usuário não é inteligente
        } finally { // Todo o final de código tem esse término.
            System.out.println("Programa finalizado."); // Mostra que o código acabou
            sc.close(); // Fecha o Scanner para que deixe de gastar memória guardando informações.
        }
    }
}
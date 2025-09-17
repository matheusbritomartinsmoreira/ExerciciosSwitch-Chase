/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classificadoridade2;

/**
 *
 * @autor Matheus Brito Martins Moreira
 */

import java.util.Scanner; // Importa Scanner para poder ser usado

public class ClassificadorIdade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Abre o Scanner para guardar Inputs do usuário

        try { // Executa com os Inputs válidos
            System.out.println("=== Classificador de Faixa Etária ==="); 
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt(); // Cria a variável int "idade"

            int faixa = 0; // Variável criada, até agora o valor é 0

            if (idade >= 0 && idade <= 12) { // Se a idade for de 0 a 12
                faixa = 1; // Variável de faixa etária vira 1
            } else if (idade >= 13 && idade <= 17) { // Se a idade for entre 13 e 17
                faixa = 2; // Faixa etária vira 2
            } else if (idade >= 18 && idade <= 59) { // Se for entre 18 e 59
                faixa = 3; // Faixa etária vira 3
            } else if (idade >= 60 && idade <= 120) { // Se for entre 60 e 120
                faixa = 4; // Faixa etária será 4
            } else {
                System.out.println("Idade inválida!"); // Se for uma idade impossível(menos de 0 ou mais de 120)
                return;
            }

            switch (faixa) {
                case 1 -> System.out.println("Você é uma criança."); // Se faixa 1, você é criança
                case 2 -> System.out.println("Você é um adolescente."); // Se faixa 2, você é adolescente
                case 3 -> System.out.println("Você é um adulto."); // Se faixa 3, você é adulto
                case 4 -> System.out.println("Você é um idoso."); // Se faixa 4, você é idoso
            }

        } catch (Exception e) { // Se for valor fora de int
            System.out.println("Erro: digite apenas números!");
        } finally { // Todo código termina executando isso 
           System.out.println("Programa encerrado."); // Encerra o programa
            sc.close(); // Fecha o Scanner para dixar de gastar memória guardando Inputs
        }
    }
}
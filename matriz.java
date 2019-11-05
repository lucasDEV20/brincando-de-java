/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_N2;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variaaveis da matriz
        //alem das variaveis a variavel da matriz ja e iniciada com o valor do tamanhi da linha e da coluna
        int MAXLIN = 7, MAXCOL = 7 ;
        //variavel que dara a soma da media
        int soma = 0, cont = 0;
        //variavel da media
        double media = 0;
        //criando a matriz e dando suas respectivas posiçoes
        int[][] matriz = new int[MAXLIN][MAXCOL];
        //for que vai definir as linhas
        for (int i = 0; i < MAXLIN; i++) {
            //for que vai deficnir as colunas
            for (int j = 0; j < MAXCOL; j++) {
                System.out.println();
                System.out.println("=====================================================================================================");
                System.out.println("informe a matriz[" + i + "]" + "[" + j + "}: ");
                matriz[i][j] = entrada.nextInt();
                //entrada dos valores da matriz
                System.out.println("=====================================================================================================");
                //condiçao de apenas valores positivos
                while (matriz[i][j] < 0) {
                    System.out.println("=====================================================================================================");
                    System.out.println("informe apenas valores positivos! ");
                    System.out.println("informe a matriz[" + i + "]" + "[" + j + "}: ");
                    System.out.println("=====================================================================================================");
                    matriz[i][j] = entrada.nextInt();

                }
                //cont da media precisa vim sempre em baixo das condiçoes( while ou if ) pq se nao for assim da erro
                soma += matriz[i][j];
                cont++;
            }
        }
        //verificaçao da coluna maior e linha menor
        int maior = matriz[0][0];
        int linMaior = 0, colMaior = 0;
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linMaior = i;
                    colMaior = j;

                }

            }
        }
        //verificaçao da linha menor e coluna menor
        int menor = matriz[0][0];
        int linMenor = 0, colMenor = 0;
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linMenor = i;
                    colMenor = j;
                }
            }
        }
        //saida de dados : maior e menor valor nas linhas e colunas
        System.out.println();
        System.out.println("=====================================================================================================");
        System.out.println("\n\nMaior eelemento da matriz é o " + maior + " na posiçao[" + linMaior + "]" + "[" + colMaior + "]\n");
        System.out.println("\n\nMenor eelemento da matriz é o " + menor + " na posiçao[" + linMenor + "]" + "[" + colMenor + "]\n");
        System.out.println("=====================================================================================================");
        System.out.println("impresao da matriz em formato matricial");
        System.out.println("=====================================================================================================");
        //mostrando a matriz em forma matricial
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                System.out.print(matriz[i][j] + "\t");
        

            }
            System.out.println();
        }
        //conta da media , que tem o valor da soma percorrida no codigo a partir da soma e da quandidade numeros
        media = soma / cont;
        System.out.println();
        System.out.println("=====================================================================================================");
        System.out.println("A media e " + media);
        System.out.println("=====================================================================================================");
    }
}
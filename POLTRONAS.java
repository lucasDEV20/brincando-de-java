/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_n2;

import javax.swing.JOptionPane;

/**
 *
 * @author Computador
 */
public class POLTRONAS {

    public static void main(String[] args) {
        int pol[][] = new int[14][10];
        inicializar(pol);
        ingresso(pol);
        disponibilidade(pol);
    }

    public static void inicializar(int pol[][]) {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 10; j++) {
                pol[i][j] = 0;
            }
        }
    }

    public static void ingresso(int pol[][]) {
        int k = 1;
        while (k != 0) {
            int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da fila"));
            int j = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da poltrona"));
            if (pol[i][j] == 0) {
                pol[i][j] = 0;
                String nome = JOptionPane.showInputDialog("Digite seu nome,por favor!");
            } else {
                JOptionPane.showMessageDialog(null, "Desculpe!Essa poltrona já está ocupada \n Por favor, escolha outra.");
            }

            k = Integer.parseInt(JOptionPane.showInputDialog("Você quer comprar mais um ingresso?\n 1-sim\n 0-não"));

            System.out.println("=====================================================================================================");
            System.out.println("====POLTRONAS====");
            System.out.println("=====================================================================================================");
            for (int[] pol1 : pol) {
                for (int[] pol2 : pol) {

                    System.out.print(pol[i][j] + "\t");
                }

                System.out.println();
            }
        }
    }

    public static void disponibilidade(int pol[][]) {
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int m = 0;
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da fila"));
        for (int j = 0; j < 10; j++) {
            if (pol[i][j] == 0) {
                cont++;
                cont2++;
            }
            if (cont == 1) {
                m = j;
                int y = j;

                while (y < 0) {
                    // y++ posicao do incremento antes
                    if (pol[i][y] == 0) {
                        cont3++;

                    } else {
                        break;
                    }
                    y++; // posicao atual do incremento
                }

            }

        }

        System.out.println("Nessa fila existem " + cont2 + " poltronas disponíveis");
        System.out.println("A primeria poltrona livre da fila é a de número " + m);
        System.out.println("E ao lado dessa poltrona há mais " + cont3 + " poltronas livre(s) ");

    }
}

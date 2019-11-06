/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_N2;

public class numeroperfeito {
    public static void main(String[] args) {
        int n , c ; 
        int soma ;
        for ( n = 1; n <= 1000; n++) {
            soma = 0 ;
            for ( c = 1; c <= n/2; c++) {
                if (n % c == 0) {
                    soma = soma + c;
                }
            
            if (soma == n ) {
                System.out.println(n + "é PERFEITO");
        }else {
                System.out.println(n +"NAO ´é PERFEITO");
            }
        }
        }
    }
    
}

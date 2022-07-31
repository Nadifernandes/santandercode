package DesafioSantander;

import java.util.Scanner;

public class nota {
    /* Nota de 0 a 10 que 
     * mostre caso o numero seja invalido
     */

     public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        
            int nota;

            System.out.println("Digite uma nota: ");
            nota = scann.nextInt();

                while(nota < 0 | nota > 10){
                    
                    System.out.println("Nota invalida, digite novamente: ");
                    nota = scann.nextInt();
                }
        
        }
     }


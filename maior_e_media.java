package DesafioSantander;

import java.util.Scanner;

public class maior_e_media {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0; 
        int count = 0;
        int soma = 0; /*atribui o zero porque a soma começa do 0 */


        
        do{
            System.out.println("Digite 5 numeros: ");
        numero = scan.nextInt();

        soma = soma + numero;

        if (numero > maior) maior = numero; 


        count = count + 1; /*contador vale 1 posterior contador = contador que vale (1 + 1 ) o contador valerá 2 
        e ai o contador valerá 2 + 1 e o contador vira 3 assim por diante  */
    
        } while(count < 5);

        System.out.println("O numero Maior é: " + maior + "A soma dos numeros é: " + soma + " e a média dos numeros é: "+ (soma/5));
         /*fora do laço ele só irá dar o resultado do maior apos a repetição do laço */


    }
}

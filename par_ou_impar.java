package DesafioSantander;

import java.util.Scanner;

public class par_ou_impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("quantidade de Numeros: "); /*pede para definir a repetição do laço */
        quantNumeros = scan.nextInt();

        int count = 0; /*inicia sem em 0 */
        do{
            System.out.println("Digite um numero: "); 
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++; /*numero dividido por 2 precisa sobrar 0 para ser par */
            else quantImpares++;

            count++; /*contador mais o encremento +1 sempre contador +1/ resultado + 1 */

        } while(count < quantNumeros ); /*o contador encerra a repetição baseada a quantidade definida pelo usuario */
        System.out.println("Você digitou " + quantPares + " numeros pares e " + quantImpares + " numeros impares.");
    }
}

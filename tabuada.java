package DesafioSantander;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Tabuada;

        System.out.println("Qual tabuada deseja?");
       Tabuada = scan.nextInt();

        System.out.println("Resultados da tabuada do " + Tabuada);
        


        for(int i = 1;i <= 10; i = i + 1)/* int i = equivale ao contador (count) / na segunda parte é o limite/
        *e a 3 parte é o incremento*/ {
            System.out.println(Tabuada + " X " + i + " = " + (Tabuada * i));

        }

    }
    }
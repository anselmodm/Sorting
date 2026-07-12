//@ADM_24MaR2026 Exercicio Módulo 1: JAVA. Tema 4 - Tarefa2: Ordenar

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

       //Escolher o tamanho do array
        System.out.println("Introduza o tamanho da lista: ");
        int A = in.nextInt();
        int[] lista = new int[A];

        //Introduzir os números
        for (int i = 0; i< lista.length;i++){
            System.out.println("Insira o número da posição: "+i+": ");
            lista[i] = in.nextInt();
        }
        in.close();
        //apresentar os números inseridos
        System.out.println("Array desordenado: ");
        for( int num : lista){
            System.out.print(num +" ");
        }

        //Array ordenado
        Ordenar.selectionSort(lista);

        System.out.println("\nArray ordenado: ");
        for( int num : lista){
            System.out.print(num +" ");
        }
    }
}
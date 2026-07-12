//@ADM_24MaR2026 Exercicio Módulo 1: JAVA. Tema 4 - Tarefa2: Ordenar
public class Ordenar {


   public static void selectionSort(int[] A){
       int N = A.length;

       for(int i=0; i < N-1; i++){
           int minIndex = i;

           for (int j = i + 1; j < N; j++){
               if (A[j] <A[minIndex]){
                   minIndex = j;
               }
           }
           if (minIndex != i){
               int temp = A[i];
               A[i] = A[minIndex];
               A[minIndex] = temp;
           }
       }
    }
}

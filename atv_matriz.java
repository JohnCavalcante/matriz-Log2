/*Implemente um algoritmo em Java para calcular e imprimir o resultado da multiplicação das seguintes matrizes:

A = |2  3|
       |1  0|
       |4  5|3x2

B = |3  1|
       |2  4|2x2

AxB = |12 14|     <------------SAIDAA
           | 3   1 |
           |22 24|3x2 */




import java.util.Scanner;

public class LDP7253 {

	public static void main(String[] args) {
	int [][] matrizA = {
			{2,3},
			{1,0},
			{4,5}
		};
	int [][] matrizB = {
			{3,1},
			{2,4}
	};	
	int [][] matrizAxB = new int [3][2];

	   for (int i = 0; i < matrizA.length; i++) {
		      for (int j = 0; j < matrizAxB[i].length; j++) {
		    	  matrizAxB[i][j] = matrizA[i][0] * matrizB[0][j] + matrizA[i][1] * matrizB[1][j];   
			        System.out.println(matrizAxB[i][j]);
		      }
		 }

    }
}

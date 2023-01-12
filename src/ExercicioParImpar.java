import java.util.Scanner;

//Exercicios 4
/* 📝 DO-WHILE
/* 🔸Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares. */

public class ExercicioParImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantNumeros;
    int numero;
    int quantPares= 0;
    int quantImpares= 0;

  System.out.println("Quantidade de números: ");
  quantNumeros = scan.nextInt();
    
    int contador= 0;
    do {
      System.out.println("Numero: ");
      numero = scan.nextInt();

      if(numero % 2 == 0) 
      quantPares++;
      else 
      quantImpares++;

      contador++;
    }while(contador < quantNumeros);
    System.out.println("Quantidade Par: " + quantPares);
    System.out.println("Quantidade Impar: "+ quantImpares);
  }

}
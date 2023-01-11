import java.util.Scanner;

//Exercicios 3
/* 📝 DO-WHILE
🔸Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números. */

public class ExercicioMaiorEMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;
    int maior= 0;
    int soma= 0;

    int contador= 0;
    do{
      System.out.println("Numero: ");
      numero = scan.nextInt();

      soma = soma + numero;

      if(numero > maior) maior = numero;
      contador = contador +1;
    }while(contador < 5);
    System.out.println("Maior: " + maior);
    System.out.println("Média: " + (soma/5));
  }
}

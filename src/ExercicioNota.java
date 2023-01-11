import java.util.Scanner;

//Exercicios 2
/* 📝 WHILE

/* 🔸Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */

public class ExercicioNota {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nota;

    System.out.println("Nota: ");
    nota = scan.nextInt();

    while(nota < 0 || nota > 10){
      System.out.println("Nota invalida! Digite novamente");
      nota = scan.nextInt();
    }
  }
}

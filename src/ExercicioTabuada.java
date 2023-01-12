import java.util.Scanner;

//Exercicios 5
/* 📝 FOR

/* 🔸Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: 

TABUADA DE 5:
5x1= 5
5x2=10
5x10=50 */

public class ExercicioTabuada {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);

    System.out.println("Tabuada: ");
    int tabuada= scan.nextInt();

    System.out.println("Tabuada de "+ tabuada);
    for(int i = 1; i <= 10; i++){
      System.out.println(tabuada + "X" + i + " = " +(tabuada*i));
    }

  }
}

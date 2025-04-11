// Este programa identifica se um número é par ou ímpar

import java.util.Scanner;

public class NumeroParImpar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite número: ");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("O número é par");
    } 
    else {
      System.out.println("O número é ímpar");
    }

    sc.close();
  }
}

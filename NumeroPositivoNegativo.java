// Este programa identifica números negativos e positivos.

import java.util.Scanner;

public class NumeroPositivoNegativo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
 
    System.out.print("Digite número: ");
    int numero = sc.nextInt();

    if (numero > 0) {
      System.out.println("O número é positivo");
    } 
    else if (numero < 0) {
      System.out.println("O número é negativo");
    } 
    else {
      System.out.println("O número é zero");
    }
    
    sc.close();
  }
}

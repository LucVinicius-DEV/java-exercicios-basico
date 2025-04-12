// Calculadora de Imposto de Renda de Lisarb

import java.util.Scanner;

public class ImpostoRendaLisarb {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o salário: R$ ");
    double salario = sc.nextDouble();
    double imposto = 0.0;

    if (salario <= 2000.00) {
      System.out.println("Isento");
    } else {
      if (salario <= 3000.00) {
        imposto = (salario - 2000.00) * 0.08;
      } else if (salario <= 4500.00) {
        imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
      } else {
        imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
      }
      System.out.printf("R$ %.2f\n", imposto);
    }

    sc.close();
  }
}

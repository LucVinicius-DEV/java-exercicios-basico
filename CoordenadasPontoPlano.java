// CoordenadasPontoPlano.java
// Este programa lê dois valores com uma casa decimal (x e y), representando
// as coordenadas de um ponto em um plano cartesiano, e determina em qual
// quadrante o ponto está, se está na origem, ou sobre um dos eixos.

import java.util.Scanner;

public class CoordenadasPontoPlano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}

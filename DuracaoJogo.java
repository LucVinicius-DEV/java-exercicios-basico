// Este programa calcula a duração de um jogo
import java.util.Scanner;

public class DuracaoJogo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a hora inicial: ");
    int horaInicial = sc.nextInt();
    System.out.print("Digite a hora final: ");
    int horaFinal = sc.nextInt();

    int duracao;

    if (horaFinal > horaInicial) {
      duracao = horaFinal - horaInicial;
    } else {
      duracao = 24 - horaInicial + horaFinal;
    }

    System.out.println("O jogo durou " + duracao + " hora(s)");

    sc.close();
  }
}

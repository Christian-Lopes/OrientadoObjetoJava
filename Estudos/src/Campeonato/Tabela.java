package Campeonato;

import java.util.Scanner;

public class Tabela {

	public void diferenca() {
		Scanner dado;

		try {
			System.out.println("Inorme os pontos do lider do campeonato: ");
			dado = new Scanner(System.in);
			int pontosLider = dado.nextInt();

			System.out.println("Informe os pontos do lanterna do campeonato: ");
			dado = new Scanner(System.in);
			int pontosLanterna = dado.nextInt();
			int jogo = 0;

			while (pontosLider >= pontosLanterna) {
				pontosLanterna += 3;
				jogo++;
			}

			System.out.println("Para o lanterna ser líder do campeonato te de ganhar " +  jogo + " jogos.");
		} catch (NumberFormatException erro) {
			System.out.println("Erro: " + erro);
		}

	}
}

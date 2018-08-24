package jogador;

import java.util.Scanner;


import Jogo.Tabuleiro;

public class Pessoa extends Jogador{
	public Scanner entrada = new Scanner(System.in);

	public Pessoa(int jogador) {
		// TODO Auto-generated constructor stub
        super(jogador);
        this.id_jogador = jogador;
        System.out.println("Jogador pessoa criado!");
	}
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		// TODO Auto-generated method stub
		jogada(tabuleiro);
		
		tabuleiro.setPosicao(posicao, id_jogador);
		
	}

	@Override
	public void jogada(Tabuleiro tabuleiro) {
		// TODO Auto-generated method stub
		
		do {
			do {
				System.out.println("Informe a linha para a jogada");
				posicao[0] = entrada.nextInt();
				if(posicao[0] > 3 || posicao[0] < 1) 
					System.out.println("Linha Inválida! Informe valores entre 1 e 3");
			} while (posicao[0] > 3 || posicao[0] < 1);
			do {
				System.out.println("Informe a coluna para a jogada");
				posicao[1] = entrada.nextInt();
				if(posicao[1] > 3 || posicao[1] < 1) 
					System.out.println("Coluna Inválida! Informe valores entre 1 e 3");
			} while (posicao[1] > 3 || posicao[1] < 1);	
            posicao[0]--; 
            posicao[1]--;
	        if(!validarJogada(posicao, tabuleiro))
	            System.out.println("Esse local já foi marcado. Tente outro.");
    		}while(!validarJogada(posicao, tabuleiro));

	}

	@Override
	public boolean validarJogada(int[] posicao, Tabuleiro tabuleiro) {
		// TODO Auto-generated method stub
		return (tabuleiro.getPosicao(posicao) == 0) ? true: false;	
	}

}

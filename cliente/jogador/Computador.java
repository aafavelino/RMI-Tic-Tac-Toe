package jogador;

import Jogo.Tabuleiro;

public class Computador extends Jogador{
	
	public Computador(int jogador) {
		// TODO Auto-generated constructor stub
		super(jogador);
		this.id_jogador = jogador;
		System.out.println("Jogador IA criado!");
	}

	@Override
	public void jogar(Tabuleiro tabuleiro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jogada(Tabuleiro tabuleiro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validarJogada(int[] posicao, Tabuleiro tabuleiro) {
		// TODO Auto-generated method stub
		return false;
	}
}

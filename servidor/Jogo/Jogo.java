package Jogo;

import java.util.Scanner;

import jogador.Computador;
import jogador.Jogador;
import jogador.Pessoa;

public class Jogo {
	private Tabuleiro tabuleiro;
	private Jogador jogadorX;
	private 	Jogador jogadorY;
	public Scanner entrada = new Scanner(System.in);
	public int jogadorDaVez = 1;
	
	/**
	 * Construtor...
	 */
	public Jogo() {
		// TODO Auto-generated constructor stub
		tabuleiro = new Tabuleiro();
	}
	
	public void iniciarJogo() {
		carregarJogadores();
		while (jogar());
	}
	
	/**
	 * Jogo rodando...
	 */
	public boolean jogar () {
	
		if (ganhador() == 0) {
	        if(vez()==1)
	            jogadorX.jogar(tabuleiro);
	        else 
	            jogadorY.jogar(tabuleiro);
	       
			
			if (tabuleiro.tabuleiroPreenchido()) {
                System.out.println("Jogo empatado!");
                return false;				
			}
			jogadorDaVez++;
			return true;
		} else {
            if(ganhador() == 1 )
                System.out.println("Jogador 2 ganhou!");
            else
                System.out.println("Jogador 1 ganhou!");
            
            return false;
		}
		
	}
	
    public int vez(){
        if(jogadorDaVez%2 == 1)
            return 1;
        else
            return 2;
    }
	
	
	/**
	 * Método para validar o tipo do jogador, se vai ser duas pessoas, ou dois computadores 
	 * ou uma pessoa e um computador... 
	 * Ps.: Os dois computadores será pra disciplina de grafos...
	 */
	public int validarJogadores() {
		int tipo_jogador = 0;
		do {
			System.out.printf("1. Pessoa...\n2. Computador...");
			tipo_jogador = entrada.nextInt();
			System.out.println(tipo_jogador);
			if((tipo_jogador != 1 && tipo_jogador != 2))
				System.out.println("Opção inválida!");
		
		} while (tipo_jogador != 1 && tipo_jogador != 2);
		
	
		return tipo_jogador;
	}
	
	/**
	 * Método para carregar os jogadores no jogo...
	 */
	public void carregarJogadores() {
        System.out.println("Informe quem será o Jogador 1 ?");
        if(validarJogadores() == 1)
            this.jogadorX = new Pessoa(1);
        else
            this.jogadorX = new Computador(1);
        
        System.out.println("================================");
        System.out.println("Informe quem será o Jogador 2 ?");
        
        if(validarJogadores() == 1)
            this.jogadorY = new Pessoa(2);
        else
            this.jogadorY = new Computador(2);		
	}
	
	/**
	 * Função para verificar se há ganhador.
	 * @return 1 ou -1 para ganhador, 0 caso contrário.
	 */
	public int ganhador() {
		return tabuleiro.checagemDeColunas() == -1?-1:tabuleiro.checagemDeLinhas() == -1?-1:tabuleiro.checagemDeDiagonais()==-1?-1:
			   tabuleiro.checagemDeColunas() == 1? 1:tabuleiro.checagemDeLinhas() == 1? 1:tabuleiro.checagemDeDiagonais()== 1? 1: 0;
	}
}

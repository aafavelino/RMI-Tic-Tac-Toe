package execucao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import jogador.Jogador;

public interface IJogo extends Remote{
	
	public boolean isJogadaValida(int id, int linha, int coluna) throws RemoteException;

	public int[][] fazerJogada(int linha, int coluna) throws RemoteException;

	public Jogador alguemVenceu() throws RemoteException;
}

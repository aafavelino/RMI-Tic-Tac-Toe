package execucao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import jogador.Jogador;

@SuppressWarnings("serial")
public class JogoImp extends UnicastRemoteObject implements IJogo {

	protected JogoImp() throws RemoteException {
		super();
		
	}

	@Override
	public boolean isJogadaValida(int id, int linha, int coluna) throws RemoteException {
		
		return false;
	}

	@Override
	public int[][] fazerJogada(int linha, int coluna) throws RemoteException {
		
		return null;
	}

	@Override
	public Jogador alguemVenceu() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}

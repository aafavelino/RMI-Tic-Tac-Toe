package jogador;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws RemoteException, 
		NotBoundException, MalformedURLException{
		
		/* Busca no modulo de comunicacao remota (RMI Registry).
		 * Retorna-se uma referencia de objeto para o stub de servidor, 
		 * atraves do qual e possivel realizar a invocacao de metodos remotos */
		//ICalc stub = (ICalc) Naming.lookup("rmi://localhost/Calculadora");

		// Opcao escolhida pelo usuario
		Scanner input = new Scanner(System.in);
		input.close();

	}

}

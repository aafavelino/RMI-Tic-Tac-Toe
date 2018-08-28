package Jogo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// Execução do modulo de referência remota (RMI Registry)
		LocateRegistry.createRegistry(1099);
		
		// Instanciacao do servente
		//Calculadora calculadora = new Calculadora();
		
		// Registro do servente no modulo de referencia remota (RMI Registry)
		//Naming.rebind("rmi://localhost/Calculadora", calculadora);
		System.out.println("Servidor pronto e registrado no RMI Registry.");
	}

}

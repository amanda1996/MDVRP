package problema;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;

import modelo.Cliente;
import modelo.Deposito;
import modelo.Problema;

public class CalculaDistancia {

	public static double[][] calculaDistanciaClienteDeposito(Problema problema) {
		double[][] matriz = new double[problema.getNum_clientes()][problema.getNum_depositos()];
		ArrayList<Deposito> depositos = problema.getDepositos();
		LinkedList<Cliente> clientes = problema.getClientes();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = distanciaEuclid(clientes.get(i).getX(),
						clientes.get(i).getY(), depositos.get(j).getX(), depositos.get(j).getY());
			}
		}
		return matriz;
	}

	public static double[][] calculaDistanciaClienteCliente(Problema problema) {
		double[][] matriz = new double[problema.getNum_clientes()][problema.getNum_clientes()];
		LinkedList<Cliente> clientes = problema.getClientes();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = distanciaEuclid(clientes.get(i).getX(), clientes.get(i).getY(), clientes.get(j).getX(),
						clientes.get(j).getY());
			}
		}
		return matriz;
	}

	public static double distanciaEuclid(double x1, double y1, double x2, double y2) {
		double distancia = (Math.sqrt(Math.abs(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2))));
		return distancia;
	}

	public void imprimeDistancias(double[][] matrizDC, double[][] matrizCC) {
		System.out.println("--------------DISTÂNCIA CLIENTES/DEPOSITOS --------------");
		for (int i = 0; i < matrizDC.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrizDC[0].length; j++) {
				System.out.print(matrizDC[i][j] + " ");
			}
			System.out.print("]\n");
		}

		System.out.println("\n\n--------------DISTÂNCIA CLIENTE/CLIENTE--------------");
		for (int i = 0; i < matrizCC.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrizCC[0].length; j++) {
				System.out.print(matrizCC[i][j] + " ");
			}
			System.out.print("]\n");
		}
	}
}

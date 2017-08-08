package problema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import modelo.Cliente;
import modelo.Deposito;
import modelo.Problema;

public class Clustering {

	public void clustering(double[][] matrizDC, Problema problema) {
		double[] vetorDistancias;
		double menorDistanciaCD;
		int posDepositoEscolhido;

		LinkedList<Cliente> clientes = problema.getClientes();

		for (int i = 0; i < clientes.size(); i++) {
			menorDistanciaCD = matrizDC[i][0];
			posDepositoEscolhido = 0;
			for (int j = 0; j < matrizDC[0].length; j++) {
				if (matrizDC[i][j] < menorDistanciaCD) {// descobre qual é o deposito mais proximo para o cliente atual
					menorDistanciaCD = matrizDC[i][j];
					posDepositoEscolhido = j;
				}
			}
			// adiciona o cliente atual no deposito escolhido a partir da posição salva
			Deposito depositoAtual = problema.getDepositos().get(posDepositoEscolhido);
			try {
				depositoAtual.getClientes().add(clientes.get(i));
				depositoAtual.setDemandaAtendida(depositoAtual.getDemandaAtendida() + clientes.get(i).getDemanda());
			} catch (NullPointerException e) {
				depositoAtual.setClientes(new LinkedList<Cliente>());
				depositoAtual.getClientes().add(clientes.get(i));
				depositoAtual.setDemandaAtendida(depositoAtual.getDemandaAtendida() + clientes.get(i).getDemanda());
			}
		}
	}
	
	public void imprimeClusters(Problema problema) {
		Deposito deposito;
		
		 for (int i = 0; i < problema.getNum_depositos(); i++) {
			 deposito = problema.getDepositos().get(i);
			System.out.println("****************** DEPÓSITO " + problema.getDepositos().get(i).getId() + " ******************\n");
			
			for (int j = 0; j < deposito.getClientes().size(); j++) {
				System.out.println("Cliente " + deposito.getClientes().get(j).getId());
			}
		}
	}

}

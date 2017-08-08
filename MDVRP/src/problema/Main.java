package problema;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Deposito;
import modelo.Problema;
import modelo.Solucao;
import modelo.Veiculo;

public class Main {
	
	public static Scanner in = new Scanner(System.in);
	public static int qtdIndividuo;
	public static Problema problema;
	
	public static void main(String[] args){
		
		LeInstancias leitor = new LeInstancias();
		CalculaDistancia calcDistancia = new CalculaDistancia();
		Clustering clustering = new Clustering();
		
		
		try {
			
			problema = leitor.leDat("instancias/p01");
			
			double[][] matrizDC = calcDistancia.calculaDistanciaClienteDeposito(problema);
			double[][] matrizCC = calcDistancia.calculaDistanciaClienteCliente(problema);			
			
			calcDistancia.imprimeDistancias(matrizDC, matrizCC);
			
			clustering.clustering(matrizDC, problema);
			
			clustering.imprimeClusters(problema);
			
			System.out.println("Informe o número de indivíduos da população:");
			qtdIndividuo = in.nextInt();
			
			ArrayList<Solucao> solucoes = new ArrayList();
			
			for(Solucao s: solucoes) {
				LinkedList<Cliente> clientes = new LinkedList<Cliente>();
				s.setDepositos(problema.getDepositos());
				for(Deposito d: s.getDepositos()) {
					Collections.shuffle(d.getClientes());
					d.setClientes(new LinkedList<Cliente>());
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public LinkedList<Cliente> geraRotas(ArrayList<Deposito> depositos){
		LinkedList<Cliente> clientes = new LinkedList<Cliente>();
		ArrayList<Veiculo> veiculos = problema.getVeiculos();
		Collections.sort(veiculos);
		Collections.sort(depositos);
		
		//atribui veículo
		for (Deposito d: depositos) {
			clientes = d.getClientes();//deposito de menor demanda
			d.setVeiculoEscolhido(veiculos.get(0));// veiculo de menor capacidade
			veiculos.remove(0);
		}
		
		//cria rota
		for (Deposito d: depositos) {
			double capacidadeAtingida = 0;
			clientes = d.getClientes();//deposito de menor demanda
			Collections.shuffle(clientes);
			
			for (Cliente c: clientes) {
				capacidadeAtingida += c.getDemanda();
				if(capacidadeAtingida <= d.getVeiculoEscolhido().getCarga_maxima()) {
					//adiciona o cliente na rota
				}else {
					//adiciona o deposito na rota e zera a capacidade
				}
			}
			
		}
		
		return clientes;
	}

}

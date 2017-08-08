package modelo;

import java.util.ArrayList;

public class Populacao {
	private ArrayList<Solucao> solucoes;
	private int qtdIndividuos;
	
	public Populacao() {
		
	}
	
	public Populacao(ArrayList<Solucao> solucoes, int qtdIndividuos) {
		super();
		this.solucoes = solucoes;
		this.qtdIndividuos = qtdIndividuos;
	}

	public ArrayList<Solucao> getSolucoes() {
		return solucoes;
	}

	public void setSolucoes(ArrayList<Solucao> solucoes) {
		this.solucoes = solucoes;
	}

	public int getQtdIndividuos() {
		return qtdIndividuos;
	}

	public void setQtdIndividuos(int qtdIndividuos) {
		this.qtdIndividuos = qtdIndividuos;
	}
	
}

package modelo;

import java.util.ArrayList;

public class Solucao {
	private ArrayList<Deposito> depositos;
	private double custoTotal;
	
	public Solucao() {
		
	}
	
	public Solucao(ArrayList<Deposito> depositos, double custoTotal) {
		super();
		this.depositos = depositos;
		this.custoTotal = custoTotal;
	}

	public ArrayList<Deposito> getDepositos() {
		return depositos;
	}

	public void setDepositos(ArrayList<Deposito> depositos) {
		this.depositos = depositos;
	}

	public double getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(double custoTotal) {
		this.custoTotal = custoTotal;
	}
	
		
	
}

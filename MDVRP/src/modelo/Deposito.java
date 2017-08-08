package modelo;

import java.util.LinkedList;

public class Deposito implements Comparable<Deposito>{
	private int id;
	private double x, y, demandaAtendida = 0;
	private Veiculo veiculoEscolhido;
	private LinkedList<Cliente> clientes;//define a rota de cada deposito
	
	public Deposito(){
		
	}

	public Deposito(int id, double x, double y, double demandaAtendida, Veiculo veiculoEscolhido,
			LinkedList<Cliente> clientes) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.demandaAtendida = demandaAtendida;
		this.veiculoEscolhido = veiculoEscolhido;
		this.clientes = clientes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	

	public double getDemandaAtendida() {
		return demandaAtendida;
	}

	public void setDemandaAtendida(double demandaAtendida) {
		this.demandaAtendida = demandaAtendida;
	}
	
	public Veiculo getVeiculoEscolhido() {
		return veiculoEscolhido;
	}

	public void setVeiculoEscolhido(Veiculo veiculoEscolhido) {
		this.veiculoEscolhido = veiculoEscolhido;
	}

	public LinkedList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(LinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public int compareTo(Deposito outroDeposito) {
		if(this.demandaAtendida < outroDeposito.getDemandaAtendida()) {
			return -1;
		}
		if(this.demandaAtendida > outroDeposito.getDemandaAtendida()) {
			return 1;
		}
		return 0;
	}
	
	
}

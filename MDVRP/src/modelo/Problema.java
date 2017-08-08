package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Problema {
	private int tipo, num_veiculos, num_clientes, num_depositos;
	private LinkedList<Cliente> clientes;
	private ArrayList<Deposito> depositos;
	private ArrayList<Veiculo> veiculos;
	
	public Problema(){
		
	}
	
	public Problema(int tipo, int num_veiculos, int num_clientes, int num_depositos,
			LinkedList<Cliente> clientes, ArrayList<Deposito> depositos,
			ArrayList<Veiculo> veiculos) {
		super();
		this.tipo = tipo;
		this.num_veiculos = num_veiculos;
		this.num_clientes = num_clientes;
		this.num_depositos = num_depositos;
		this.clientes = clientes;
		this.depositos = depositos;
		this.veiculos = veiculos;
	}

	public Problema(int tipo, int num_veiculos, int num_clientes,
			int num_depositos) {
		super();
		this.tipo = tipo;
		this.num_veiculos = num_veiculos;
		this.num_clientes = num_clientes;
		this.num_depositos = num_depositos;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getNum_veiculos() {
		return num_veiculos;
	}

	public void setNum_veiculos(int num_veiculos) {
		this.num_veiculos = num_veiculos;
	}

	public int getNum_clientes() {
		return num_clientes;
	}

	public void setNum_clientes(int num_clientes) {
		this.num_clientes = num_clientes;
	}

	public int getNum_depositos() {
		return num_depositos;
	}

	public void setNum_depositos(int num_depositos) {
		this.num_depositos = num_depositos;
	}

	public LinkedList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(LinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Deposito> getDepositos() {
		return depositos;
	}

	public void setDepositos(ArrayList<Deposito> depositos) {
		this.depositos = depositos;
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
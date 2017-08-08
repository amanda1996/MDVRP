package modelo;

import java.util.ArrayList;

public class Cliente {
	private int id, frequencia_visita, num_combinacoes, duracao_servico, demanda;
	private double inicio, fim, x,y;
	private Deposito depositoEscolhido;
	
	public Cliente(){
		
	}
	
	public Cliente(int id, double x, double y, int frequencia_visita,
			int num_combinacoes, int duracao_servico, int demanda,
			double inicio, double fim,
			Deposito depositoEscolhido) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.frequencia_visita = frequencia_visita;
		this.num_combinacoes = num_combinacoes;
		this.duracao_servico = duracao_servico;
		this.demanda = demanda;
		this.inicio = inicio;
		this.fim = fim;
		this.depositoEscolhido = depositoEscolhido;
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
	public int getFrequencia_visita() {
		return frequencia_visita;
	}
	public void setFrequencia_visita(int frequencia_visita) {
		this.frequencia_visita = frequencia_visita;
	}
	public int getNum_combinacoes() {
		return num_combinacoes;
	}
	public void setNum_combinacoes(int num_combinacoes) {
		this.num_combinacoes = num_combinacoes;
	}
	
	public int getDemanda() {
		return demanda;
	}
	
	public void setDemanda(int demanda) {
		this.demanda = demanda;
	}
	
	public int getDuracao_servico() {
		return duracao_servico;
	}
	
	public void setDuracao_servico(int duracao_servico) {
		this.duracao_servico = duracao_servico;
	}
	
	public double getInicio() {
		return inicio;
	}
	
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	
	public double getFim() {
		return fim;
	}
	
	public void setFim(double fim) {
		this.fim = fim;
	}

	public Deposito getDepositoEscolhido() {
		return depositoEscolhido;
	}

	public void setDepositoEscolhido(Deposito depositoEscolhido) {
		this.depositoEscolhido = depositoEscolhido;
	}
}
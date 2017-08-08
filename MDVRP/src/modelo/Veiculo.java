package modelo;

import java.util.Collection;

public class Veiculo implements Comparable<Veiculo>{
	private int id;
	private double carga_maxima;
	//tirei maxima_duracao
	
	public Veiculo(){
		
	}
	
	public Veiculo(int id, double carga_maxima) {
		super();
		this.id = id;
		this.carga_maxima = carga_maxima;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCarga_maxima() {
		return carga_maxima;
	}
	public void setCarga_maxima(double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	public int compareTo(Veiculo outroVeiculo) {
		if(this.carga_maxima < outroVeiculo.getCarga_maxima()) {
			return -1;
		}
		if(this.carga_maxima > outroVeiculo.getCarga_maxima()) {
			return 1;
		}
		return 0;
	}
	
}

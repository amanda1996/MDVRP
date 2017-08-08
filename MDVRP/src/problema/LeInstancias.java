package problema;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

import modelo.Cliente;
import modelo.Deposito;
import modelo.Problema;
import modelo.Veiculo;

public class LeInstancias {

	public static Problema leDat(String caminho) throws FileNotFoundException {
		Problema problema = new Problema();
		ArrayList<String> linhasProblema = null;

		BufferedReader buffered = new BufferedReader(new FileReader(caminho));

		try {
			linhasProblema = new ArrayList<String>();
			while (buffered.ready()) {
				linhasProblema.add(buffered.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		leDescricao(problema, linhasProblema.get(0));
		leInfoVeiculos(problema, linhasProblema);
		leInfoClientes(problema, linhasProblema);
		leInfoDepositos(problema, linhasProblema);
		return problema;
	}

	public static void leDescricao(Problema problema, String descProblema) {
		int tipo = -1, num_veiculos = 0, num_clientes = 0, num_depositos = 0;
		StringTokenizer tokenizer = new StringTokenizer(descProblema, " ");
		tipo = Integer.parseInt(tokenizer.nextToken());
		num_veiculos = Integer.parseInt(tokenizer.nextToken());
		num_clientes = Integer.parseInt(tokenizer.nextToken());
		num_depositos = Integer.parseInt(tokenizer.nextToken());

		problema.setTipo(tipo);
		problema.setNum_veiculos(num_veiculos);
		problema.setNum_clientes(num_clientes);
		problema.setNum_depositos(num_depositos);
	}

	public static void leInfoVeiculos(Problema problema, ArrayList<String> linhasProblema) {
		ArrayList<Veiculo> veiculos = new ArrayList();
		StringTokenizer tokenizer;

		for (int i = 1; i < problema.getNum_veiculos(); i++) {
			tokenizer = new StringTokenizer(linhasProblema.get(i), " ");
			Veiculo veiculo = new Veiculo();
			veiculo.setId(i);
			veiculo.setCarga_maxima(Integer.parseInt(tokenizer.nextToken()));
			veiculos.add(veiculo);
		}
		problema.setVeiculos(veiculos);
	}

	public static void leInfoClientes(Problema problema, ArrayList<String> linhasProblema) {
		LinkedList<Cliente> clientes = new LinkedList<Cliente>();
		StringTokenizer tokenizer;
		int inicio = problema.getNum_veiculos() + 1;
		int fim = inicio + problema.getNum_clientes();

		for (int i = inicio; i < fim; i++) {
			tokenizer = new StringTokenizer(linhasProblema.get(i), " ");
			Cliente cliente = new Cliente();
			cliente.setId(Integer.parseInt(tokenizer.nextToken()));
			cliente.setX(Integer.parseInt(tokenizer.nextToken()));
			cliente.setY(Integer.parseInt(tokenizer.nextToken()));
			cliente.setDuracao_servico((Integer.parseInt(tokenizer.nextToken())));
			cliente.setDemanda(Integer.parseInt(tokenizer.nextToken()));
			cliente.setFrequencia_visita(Integer.parseInt(tokenizer.nextToken()));
			clientes.add(cliente);
		}

		problema.setClientes(clientes);
	}

	public static void leInfoDepositos(Problema problema, ArrayList<String> linhasProblema) {
		ArrayList<Deposito> depositos = new ArrayList();
		StringTokenizer tokenizer;
		int inicio = problema.getNum_veiculos() + problema.getNum_clientes() + 1;
		int fim = inicio + problema.getNum_depositos();

		for (int i = inicio; i < fim; i++) {
			tokenizer = new StringTokenizer(linhasProblema.get(i), " ");
			Deposito deposito = new Deposito();
			deposito.setId(Integer.parseInt(tokenizer.nextToken()));
			deposito.setX(Integer.parseInt(tokenizer.nextToken()));
			deposito.setY(Integer.parseInt(tokenizer.nextToken()));
			depositos.add(deposito);
		}

		problema.setDepositos(depositos);
	}
}

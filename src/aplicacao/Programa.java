package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modelo.entidades.Aluguel;
import modelo.entidades.Veiculo;
import modelo.servicos.ServicoAluguel;
import modelo.servicos.ServicoImpostoBr;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.println("Modelo do carro: ");
		String modelo =sc.nextLine();
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		Veiculo veiculo = new Veiculo(modelo);
		Aluguel aluguel = new Aluguel(inicio, fim, veiculo);
	    
		System.out.println("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new ServicoImpostoBr());
		servicoAluguel.processarFatura(aluguel);
		
		System.out.println("");
		System.out.println("FATURA");
		System.out.println("Pagamento Basico: "+aluguel.getFatura().getPagamentoBasico());
		System.out.println("Imposto: "+aluguel.getFatura().getImposto());
		System.out.println("Pagamento total: "+aluguel.getFatura().getPagamentoTotal());
		sc.close();
	}
}

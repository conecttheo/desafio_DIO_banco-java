package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente theodoro = new Cliente();
		theodoro.setNome("Theodoro");
		
		IConta cc = new ContaCorrente(theodoro);
		IConta poupanca = new ContaPoupanca(theodoro);
		
		cc.depositar(500);
		cc.transferir(125, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

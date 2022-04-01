
public class Main {

	public static void main(String[] args) {
		Cliente danilo = new Cliente();
		danilo.setNome("Danilo");
		
		Conta corrente = new ContaCorrente(danilo);
		corrente.depositar(100);
		
		Conta poupanca = new ContaPoupanca(danilo);
		poupanca.depositar(10);
		poupanca.sacar(20);
		corrente.transferir(90, poupanca);
		poupanca.sacar(10);
		poupanca.transferir(5, corrente);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}

package atividade2;

public class App {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		ContaCorrente conta3 = new ContaCorrente();

		Banco banco = new Banco("Fernanda", conta1, "Lucas", conta2, "Carol", conta3);

		banco.creditar("Fernanda", 500);
		banco.debitar("Lucas", 100);
		banco.transferir("Fernanda", "Lucas", 200);

		System.out.println("Saldo Fernanda: " + banco.getSaldo("Fernanda"));
		System.out.println("Saldo Lucas: " + banco.getSaldo("Lucas"));
		System.out.println("Saldo Carol: " + banco.getSaldo("Carol"));
	}

}

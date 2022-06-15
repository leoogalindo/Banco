package exPratico;

public class Banco {

	public static void main(String[] args) {
		Conta pessoa1 = new Conta();
		pessoa1.setNumConta(1010);
		pessoa1.setNomeDono("Leonardo");
		pessoa1.abrirConta("CP");
		pessoa1.depositar(150);
		pessoa1.pgtoMensal();
		pessoa1.sacar(1000);
		pessoa1.fecharConta();
		pessoa1.mostrarInfo();
		
		
		
		Conta pessoa2 = new Conta();
		pessoa2.setNumConta(999);
		pessoa2.setNomeDono("Gabriel");
		pessoa2.abrirConta("cc");
		pessoa2.mostrarInfo();
		
	}

}

package exPratico;

public class Conta {
	public int numConta;
	protected String tipoConta;
	private String nomeDono;
	private float saldo;
	private boolean status;
		
	public Conta () {
		this.setSaldo(0);
		this.setStatus(false);
	}
		
	public float getSaldo () {
		return this.saldo;
	}
	
	public void setSaldo (float saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus () {
		return this.status;
	}
	
	public void setStatus (boolean status) {
		this.status = status;
	}
	
	public int getNumConta () {
		return this.numConta;
	}
	
	public void setNumConta (int numConta) {
		this.numConta = numConta;
	}
	
	public String getNomeDono () {
		return this.nomeDono;
	}
	
	public void setNomeDono (String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getTipoConta () {
		return tipoConta;
	}

	public void setTipoConta (String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public void abrirConta (String tipo) {
		this.setStatus(true);
		this.setTipoConta(tipo);
		if(tipo == "cc" || tipo == "CC") {
			this.setSaldo(50f);
		} else if(tipo == "cp" || tipo == "CP") {
			this.setSaldo(150f);
		}
		System.out.println(this.getNomeDono() + ", sua conta foi aberta com sucesso!");
	}
	
	public void fecharConta () {
		if (this.getSaldo() > 0) {
			System.out.println(this.getNomeDono() + ", sua conta não pode ser fechada, ainda possui saldo ativo");
		} else if (this.getSaldo() < 0) {
			System.out.println(this.getNomeDono() + ", sua conta não pode ser fechada, ainda possui debito ativo");
		} else {
			this.setStatus(false);
			System.out.println(this.getNomeDono() + ", sua conta foi fechada com sucesso!");
		}
	}
	
	public void depositar (float valor) {
		if(this.getStatus() == false) {
			System.out.println("Sua conta está fechada!");
		} else {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito no valor de " + valor + " realizado com sucesso na conta de " + this.getNomeDono());
		}
	}
	
	public void sacar (float valor) {
		if(this.getStatus() == false) {
			System.out.println("Sua conta está fechada");
		} else {
			if(this.getSaldo() < valor) {
				System.out.println(this.getNomeDono() + ", não é possivel realizar saque no valor de " + valor + " seu saldo não é suficiente!");
			} else {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque no valor de " + valor + " realizado com sucesso na conta de " + this.getNomeDono());
			}
		}
	}
	
	public void pgtoMensal () {
		if(this.getStatus() == false) {
			System.out.println("Sua conta está fechada");
		} else {
			if(this.getTipoConta() == "cc" || this.getTipoConta() == "CC") {
				this.setSaldo(this.getSaldo() - 12);
				System.out.println("Mensalidade paga com sucesso!");
			} else if(this.getTipoConta() == "cp" || this.getTipoConta() == "CP") {
				this.setSaldo(this.getSaldo() - 20);
				System.out.println("Mensalidade paga com sucesso!");
			}
		}
	}
	
	public void mostrarInfo () {
		System.out.println("------------- CONTA DO BANCO -------------");
		System.out.println("Dono: " + this.getNomeDono());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Numero da conta: " + this.getNumConta());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Status da conta: " + this.getStatus());
		System.out.println("---------------------------------------------");
	}
	
}

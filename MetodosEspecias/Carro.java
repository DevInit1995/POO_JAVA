package MetodosEspecias;

public class Carro {

	private String chassi;
	private String placa;
	private String cor;
	private boolean ligado;

	public Carro() {

	}

	public Carro(String chassi, String placa, String cor) {
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.parado();
	}

	public Carro(String chassi, String placa, String cor, boolean ligado) {
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.parado();
	}

	public void imprimir() {
		System.out.println("\nDescrição do carro: ");
		System.out.println("Chassi: " + this.getChassi());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Está ligado? " + this.getLigado());
	}

	public void parado() {
		this.ligado = true;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}

package MetodosEspecias;

public class Caneta {
	// Aula #04a e 4b métodos especiais

	private String modelo;
	private double ponta;
	private String cor;
	private boolean tampada;

	// método especial - construtor
	public Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);
		this.tampar();
	}

	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo da caneta? " + this.getModelo());
		System.out.println("A ponta da caneta é? " + this.getPonta());
		System.out.println("A cor da caneta é? " + this.cor);
		System.out.println("Está tampada? " + tampada);
	}

	public void tampar() {
		this.tampada = true;
	}

	/*
	 * public void rabiscar() {
	 * 
	 * if(tampada == true) { System.out.println("ERRO!"); } else {
	 * System.out.println("Rabisco."); } }
	 * 
	 * 
	 * public void destampar() { this.tampada = true; }
	 */

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

}

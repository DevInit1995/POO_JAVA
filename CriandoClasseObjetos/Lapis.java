package CriandoClasseObjetos;

public class Lapis {

	public String marca;
	public String modelo;
	public String cor;
	public boolean apontar;

	public void imprimir() {
		System.out.println("marca: " + this.marca);
		System.out.println("modelo: " + this.modelo);
		System.out.println("cor: " + this.cor);
		System.out.println("apontar: " + apontar);
	}

	public void escrever() {

		if (apontar == true) {
			System.out.println("Pronto para escrever");
		} else {
			System.out.println("Não posso escrever");
		}
	}

	public void apontar() {
		this.apontar = true;
	}
}

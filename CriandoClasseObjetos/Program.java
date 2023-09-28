package CriandoClasseObjetos;

import CriandoClasseObjetos.Caneta;

public class Program {

	public static void main(String[] args) {
		// OBJETO DO TIPO CANETA
		Caneta c1 = new Caneta();
		// REFERENCIA AO ATRIBUTO / CHAMADA
		c1.cor = "Amarelo";
		// c1.ponta = 0.5;
		// c1.tampada = false;
		c1.modelo = "Bic";
		c1.carga = 2;

		// REFERENCIA AO MÉTODO / CHAMADA
		c1.destampar();
		c1.status();
		c1.rabiscar();

		/*
		 * Lapis l1 = new Lapis(); l1.cor = "Preto"; l1.marca = "faberCastel";
		 * //l1.apontar = true;
		 * 
		 * l1.apontar(); l1.escrever();
		 */

	}

}

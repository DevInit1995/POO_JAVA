package RelacionamentoEntreClasses;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public class Program {

		public static void main(String[] args) {

			Lutador lutador[] = new Lutador[6];

			List<Lutador> lutador1 = new ArrayList<Lutador>();
			lutador1.get(1);

			for (Lutador i : lutador1) {
				System.out.println(i);
			}

			lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, "Leve", 11, 2, 1);
			lutador[0].apresentar();
			lutador[0].status();

			lutador[1] = new Lutador("PutsCrip", "Brasil", 29, 1.68, 57.8, "Leve", 14, 2, 3);
			lutador[1].apresentar();
			lutador[1].status();

			lutador[2] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, "Pesado", 5, 4, 3);
			lutador[2].apresentar();
			lutador[2].status();

			lutador[2] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, "Pesado", 12, 2, 4);
			lutador[2].apresentar();
			lutador[2].status();

			lutador[3] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, "Pesado", 12, 2, 1);
			lutador[3].apresentar();
			lutador[3].status();

			lutador[4] = new Lutador("Dead Code", "Australia", 28, 1.93, 87.6, "Pesado", 13, 0, 3);
			lutador[4].apresentar();
			lutador[4].status();

		}

	}

}

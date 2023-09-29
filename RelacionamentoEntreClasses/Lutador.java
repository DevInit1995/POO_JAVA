package RelacionamentoEntreClasses;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private Integer idade;
	private double altura;
	private double peso;
	private String categoria;
	private Integer vitorias;
	private Integer derrotas, empates;

	public Lutador(String nome, String nacionalidade, Integer idade, double altura, double peso, String categoria,
			Integer vitorias, Integer derrotas, Integer empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.categoria = categoria;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("\n\nNome do lutador: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Vitorias: " + getVitorias());
		System.out.println("Derrotas: " + getDerrotas());
		System.out.println("Empates: " + getEmpates());
	}

	public void status() {
		System.out.println("\n\n---------STATUS----------");
		System.out.println(getNome());
		System.out.println("É um peso " + getCategoria());
		System.out.println(getVitorias() + " Vitórias");
		System.out.println(getDerrotas() + " Derrotas");
		System.out.println(getEmpates() + " Empates");
	}

	public void ganharLuta() {
		setVitorias(getDerrotas() + 1);
	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria(categoria);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "inválido";
		}

	}

	public Integer getVitorias() {
		return vitorias;
	}

	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}

	public Integer getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	public Integer getEmpates() {
		return empates;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}

}

package model;

public class Contato {
	private int id;
	private String nome;
	private String numero;
	
	public Contato(int id, String nome, String numero) {
		super();
		this.id = id;
		this.nome = nome;
		this.numero = numero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//sobrecarga: dois ou mais metodos com o mesmo nome, com parametros diferentes. Reutiliza o nome do construtor
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Contato(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	
	
}

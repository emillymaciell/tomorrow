package atividade1;

public abstract class Publicacao {

	private String titulo, autor, genero, editora;
	private int anoPublicacao, qtdDisponivel;

	public abstract void imprimeDados();

	public Publicacao(String titulo, String autor, int anoPublicacao, String genero, String editora,
			int qtdDisponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.genero = genero;
		this.editora = editora;
		this.qtdDisponivel = qtdDisponivel;

	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getGenero() {
		return genero;
	}

	public String getEditora() {
		return editora;
	}

	public int getQtdDisponivel() {
		return qtdDisponivel;
	}

}
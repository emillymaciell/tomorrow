package atividade1;

public class Livro extends Publicacao {
	private int edicao;
	private String isbn;

	public int getEdicao() {
		return edicao;
	}

	public String getIsbn() {
		return isbn;
	}

	public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int qtdDisponivel,
			int edicao, String isbn) {
		super(titulo, autor, anoPublicacao, genero, editora, qtdDisponivel);
		this.edicao = edicao;
		this.isbn = isbn;
	}

	@Override
	public void imprimeDados() {
		System.out.println("Livro:");
		System.out.println("Título: " + getTitulo() + "\nAutor:" + getAutor() + "\nAno de Publicação: "
				+ getAnoPublicacao() + "\nGênero: " + getGenero() + "\nEditora: " + getEditora()
				+ "\nQuantidade disponível: " + getQtdDisponivel() + "\nEdição: " + edicao + "\nISBN: " + isbn);
	}

}
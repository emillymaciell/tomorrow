package atividade1;

public class Filme extends Publicacao {
	private String diretor, atorPrincipal, sinopse;
	private float tempoDuracao;

	public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora, int qtdDisponivel,
			String diretor, String atorPrincipal, String sinopse, float tempoDuracao) {
		super(titulo, autor, anoPublicacao, genero, editora, qtdDisponivel);
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.sinopse = sinopse;
		this.tempoDuracao = tempoDuracao;
	}

	public String getDiretor() {
		return diretor;
	}

	public String getAtorPrincipal() {
		return atorPrincipal;
	}

	public String getSinopse() {
		return sinopse;
	}

	public float getTempoDuracao() {
		return tempoDuracao;
	}

	@Override
	public void imprimeDados() {
		System.out.println("Filme:");
		System.out.println("Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de Publicação: "
				+ getAnoPublicacao() + "\nGênero: " + getGenero() + "\nEditora: " + getEditora()
				+ "\nQuantidade disponível: " + getQtdDisponivel() + "\nDiretor: " + diretor + "\nAtor Principal: "
				+ atorPrincipal + "\nSinopse: " + sinopse + "\nTempo de Duração: " + tempoDuracao + " minutos");

	}

}
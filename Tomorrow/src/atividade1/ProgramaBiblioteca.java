package atividade1;

public class ProgramaBiblioteca {

	public static void main(String[] args) {
		Livro livro = new Livro("Harry Potter", "J.K. Rowling", 1998, "Fantasia", "Rocco", 8, 1, "9788532511010");
		Filme filme = new Filme("Harry Potter", "J.K Rowling", 2001, "Fantasia", "Rocco", 6, "Chris Columbus",
				"Daniel Radcliffe",
				"Um garoto órfão de 10 anos recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada em formar jovens bruxos.",
				140);
		Publicacao[] publicacoes = new Publicacao[2];
		publicacoes[0] = livro;
		publicacoes[1] = filme;
		for (int i = 0; i < publicacoes.length; i++) {
			publicacoes[i].imprimeDados();
			System.out.println();
		}
	}

}
		// Explicações
		//Foi possível adicionar no array de publicacao um objeto do tipo Filme e um objeto do tipo Livro porque ambos herdam da classe Publicacao.
		//O método imprimeDados é abstrato na classe Publicacao, mas é implementado nas classes Livro e Filme. Quando o loop é executado, a implementação específica de cada classe é chamada.

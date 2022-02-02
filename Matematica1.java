
public class Matematica1 extends MateriasFixas {

	String conteudo;
	
	public Matematica1()
	{
		this.conteudo="Os conteudos são: "
				      + "\nConjuntos Numéricos – Teoria.\r\n"
				      + "Conjuntos Numéricos – Exercícios.\r\n"
				      + "Teoria de Conjuntos – Teoria.\r\n"
				      + "Teoria de Conjuntos – Exercícios.\r\n"
				      + "Função – Teoria.\r\n"
				      + "Função – Exercícios.\r\n"
				      + "Função de 1º Grau (Afim) – Teoria.\r\n"
				      + "Função de 1º Grau (Afim) – Exercícios.";
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	 
}

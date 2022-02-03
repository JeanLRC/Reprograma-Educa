
public class Ano2 extends MateriasFixas{

	private int carga;
	
	public Ano2()
	{
		this.carga=carga;
	}

	
	@Override
	public void matematica(String materia)
	{
		System.out.println("\nOs conteúdos de Matemática do 2° ano são:"
				+ "\r\n Matemática:\n"
				+ "Algebra\n"
				+ "Geometria\n"
				+ "Probabilidade e Estatística\n");
	}
	@Override
	public void linguagens(String materia)
	{
		System.out.println("\nOs conteúdos de Linguagens do 2° ano são:"
				+ "\r\n Portugûes:\n"
				+ "Escrita e Oralidade\n"
				+ "Concordância Nominal\n"
				+ "Orações Coordenadas\n"
				+ "Orações Adverbiais\n"
				+ "\r\n Inglês:\n"
				+ "Frases nas formas afirmativa, negativa e interrogativa\n"
				+ "Formas longa e contraída dos verbos\n"
				+ "Adjetivos e advérbios\n"
				+ "Graus de formalidade\n"
				+ "\r\n Literatura:\n"
				+ "O contexto artístico no ínicio do século XX\n"
				+ "Modernismo no Brasil - Geração de 22: Fase de destruição\n"
				+ "Neovanguardas: hibridismo e intermidialidade\n"
				+ "Prosa contemporânea no Brasil\n");
	}
	@Override
	public void cHumanas(String materia)
	{
		System.out.println("\nOs conteúdos de Ciências Humanas do 2° ano são:"
				
				+ "\r\n História:\n"
				+ "Mercantilismo e Colonização\n"
				+ "Antigo Regime e Iluminismo\n"
				+ "Independência do Brasil\n"
				+ "Primeiro Reinado\n"
				+ "Segundo Reinado\n"
				
				+ "\r/n Geografia:\n"
				+ "O espaço industrial\n"
				+ "O espaço urbano\n"
				+ "O espaço agrário\n"
				+ "Dinâmica Populacional\n"
				
				+ "\r\n Filosofia:\n"
				+ "Livre-arbítrio\n"
				+ "Metaética\n"
				+ "Ética\n"
				+ "Ética prática\n"
				+ "Filosofia da Mente\n");
	}
	@Override
	public void cNatureza(String materia)
	{
		System.out.println("\nOs conteúdos de Ciências da Natureza e suas Tecnologias são: "
				  + "\nBiologia:\r\n"
				  + "- Origem da Vida, Citologia, Reprodução;\r\n"
			      + "- Embriologia, Histologia, Seres Vivos;\r\n"
				  + "- Genética, Evolução e Ecologia.\r\n"
				  + "\nQuímica:\r\n"
			      + "- Química Geral, Físico-Química;\r\n"
			      + "- Química Nuclear e Química Orgânica.\r\n"
			      + "\nFísica:\r\n"
			      + "- Mecânica(teorias que explicam o movimento dos corpos);\r\n"
			      + "- Termologia(conceitos relacionados à temperatura e calor).\r\n");
	}
	
	
}

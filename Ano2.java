
public class Ano2 extends MateriasFixas{

	private int carga;
	
	public Ano2()
	{
		this.carga=carga;
	}

	
	@Override
	public void matematica(String materia)
	{
		System.out.println("\nOs conte�dos de Matem�tica do 2� ano s�o:"
				+ "\r\n Matem�tica:\n"
				+ "Algebra\n"
				+ "Geometria\n"
				+ "Probabilidade e Estat�stica\n");
	}
	@Override
	public void linguagens(String materia)
	{
		System.out.println("\nOs conte�dos de Linguagens do 2� ano s�o:"
				+ "\r\n Portug�es:\n"
				+ "Escrita e Oralidade\n"
				+ "Concord�ncia Nominal\n"
				+ "Ora��es Coordenadas\n"
				+ "Ora��es Adverbiais\n"
				+ "\r\n Ingl�s:\n"
				+ "Frases nas formas afirmativa, negativa e interrogativa\n"
				+ "Formas longa e contra�da dos verbos\n"
				+ "Adjetivos e adv�rbios\n"
				+ "Graus de formalidade\n"
				+ "\r\n Literatura:\n"
				+ "O contexto art�stico no �nicio do s�culo XX\n"
				+ "Modernismo no Brasil - Gera��o de 22: Fase de destrui��o\n"
				+ "Neovanguardas: hibridismo e intermidialidade\n"
				+ "Prosa contempor�nea no Brasil\n");
	}
	@Override
	public void cHumanas(String materia)
	{
		System.out.println("\nOs conte�dos de Ci�ncias Humanas do 2� ano s�o:"
				
				+ "\r\n Hist�ria:\n"
				+ "Mercantilismo e Coloniza��o\n"
				+ "Antigo Regime e Iluminismo\n"
				+ "Independ�ncia do Brasil\n"
				+ "Primeiro Reinado\n"
				+ "Segundo Reinado\n"
				
				+ "\r/n Geografia:\n"
				+ "O espa�o industrial\n"
				+ "O espa�o urbano\n"
				+ "O espa�o agr�rio\n"
				+ "Din�mica Populacional\n"
				
				+ "\r\n Filosofia:\n"
				+ "Livre-arb�trio\n"
				+ "Meta�tica\n"
				+ "�tica\n"
				+ "�tica pr�tica\n"
				+ "Filosofia da Mente\n");
	}
	@Override
	public void cNatureza(String materia)
	{
		System.out.println("\nOs conte�dos de Ci�ncias da Natureza e suas Tecnologias s�o: "
				  + "\nBiologia:\r\n"
				  + "- Origem da Vida, Citologia, Reprodu��o;\r\n"
			      + "- Embriologia, Histologia, Seres Vivos;\r\n"
				  + "- Gen�tica, Evolu��o e Ecologia.\r\n"
				  + "\nQu�mica:\r\n"
			      + "- Qu�mica Geral, F�sico-Qu�mica;\r\n"
			      + "- Qu�mica Nuclear e Qu�mica Org�nica.\r\n"
			      + "\nF�sica:\r\n"
			      + "- Mec�nica(teorias que explicam o movimento dos corpos);\r\n"
			      + "- Termologia(conceitos relacionados � temperatura e calor).\r\n");
	}
	
	
}

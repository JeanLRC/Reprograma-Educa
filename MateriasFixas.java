
public abstract class MateriasFixas {

		//ATRIBUTOS
		private String linguagens;
		private String cNatureza;
		private String cHumanas;
		private String matematica;
		
		//METODOS

		public void matematica(String materia)
		{
			this.matematica=matematica;
			System.out.println("\nOs conteudos de Matemática e suas Tecnologia do 1º ano são: "
				      + "\nConjuntos Numéricos – Teoria.\r\n"
				      + "Conjuntos Numéricos – Exercícios.\r\n"
				      + "Teoria de Conjuntos – Teoria.\r\n"
				      + "Teoria de Conjuntos – Exercícios.\r\n"
				      + "Função – Teoria.\r\n"
				      + "Função – Exercícios.\r\n"
				      + "Função de 1º Grau (Afim) – Teoria.\r\n"
				      + "Função de 1º Grau (Afim) – Exercícios.");
		}
		public void linguagens(String materia)
		{
			this.linguagens=linguagens;
			System.out.println("\nOs conteúdos de Linguagens e Suas Tecnologias do 1º ano são: "
				  + "\nArte:\r\n"
				  + "- Conceitos e técnicas de diversos estilos artísticos.\r\n"
				  + "\nEducação Física:\r\n"
			      + "- Práticas corporais e autonomia;;\r\n"
			      + "- Esportes.\r\n"
			      + "\nLingua Portuguesa:\r\n"
			      + "- Ortografia, verbos e as normas da Língua Portuguesa;\r\n"
			      + "- Teorias de leitura e escrita focadas na produção dos mais diversos gêneros textuais.\r\n"
			      + "- As origens da literatura mundial e brasileira.\r\n"
				  + "\nLingua Inglesa:\r\n"
				  + "- Gramática da Língua Inglesa.\r\n");
		}
		public void cHumanas(String materia)
		{
			this.cHumanas=cHumanas;
			System.out.println("\nOs conteúdos de Ciências Humanas e Sociais Aplicadas do 1º são: "
				  + "\nFilosofia:\r\n"
				  + "- Essência da humanidade e a realidade em que vivemos;\r\n"
			      + "- Reflexões sobre filósofos e pensadores.\r\n"
				  + "\nGeografia:\r\n"
			      + "- Clima, relevo e vegetação \r\n"
			      + "- Geografia Humana, Brasil e mundo.\r\n"
			      + "\nHistória:\r\n"
			      + "- História da humanidade;\r\n"
			      + "- História do Brasil;\r\n"
			      + "- História Geral.\r\n"
			      + "\nSociologia:\r\n"
			      + "- Como a humanidade se organiza em sociedade;\r\n"
			      + "- Quais são seus hábitos;\r\n"
			      + "- Costumes e como se relaciona entre si.\r\n");
		}
		public void cNatureza(String materia)
		{
			this.cNatureza=cNatureza;
			System.out.println("\nOs conteúdos de Ciências da Natureza e suas Tecnologias do 1º são: "
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
		
		public String getLinguagens() {
			return linguagens;
		}
		public void setLinguagens(String linguagens) {
			this.linguagens = linguagens;
		}
		public String getcNatureza() {
			return cNatureza;
		}
		public void setcNatureza(String cNatureza) {
			this.cNatureza = cNatureza;
		}
		public String getcHumanas() {
			return cHumanas;
		}
		public void setcHumanas(String cHumanas) {
			this.cHumanas = cHumanas;
		}
		public String getMatematica() {
			return matematica;
		}
		public void setMatematica(String matematica) {
			this.matematica = matematica;
		}
}

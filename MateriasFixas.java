
public abstract class MateriasFixas {

		//ATRIBUTOS
		private String matematica;
		private String linguagens;
		private String cNatureza;
		private String cHumanas;
		private String privada;
		private String publica;
		
		
		//METODOS
		public void escola(String privada, int x)
		{
			this.privada=privada;
			System.out.println("privada"+this.privada);
		}
		public void escola(String publica)
		{
			this.publica=publica;
			System.out.println("escola publica"+this.publica);
		}
		



		public String getPrivada() {
			return privada;
		}
		public void setPrivada(String privada) {
			this.privada = privada;
		}
		public String getPublica() {
			return publica;
		}
		public void setPublica(String publica) {
			this.publica = publica;
		}
		public void matematica()
		{
			this.matematica=matematica;
		}
		public void linguagens()
		{
			this.linguagens=linguagens;
		}
		public void cNatureza()
		{
			this.cNatureza=cNatureza;
		}
		public void cHumanas()
		{
			this.cHumanas=cHumanas;
		}
		
		public String getMatematica() {
			return matematica;
		}

		public void setMatematica(String matematica) {
			this.matematica = matematica;
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

}



public class Ano1 extends MateriasFixas {
	
	private int carga;
	
	public void cargH(int x)
	{
		this.carga=x;
	}
	public void cargaH(int x ,int y)
	{
		this.carga=x-y;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}

}

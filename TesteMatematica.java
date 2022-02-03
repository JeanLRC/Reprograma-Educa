import java.util.Scanner;

public class TesteMatematica{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Ano1 ano = new Ano1();
		Ano2 ano2 = new Ano2();
		Ano3 ano3 = new Ano3();
		
		String nome;
		String escola;
		String periodo;
		int idade;
		int anoEscolar;
		int materia;
		/*
		System.out.println("Qual o seu nome? ");
		nome=leia.next();
		System.out.println("Qual o nome da sua escola?");
		escola=leia.next();
		System.out.println("Qual o periodo que você estuda? ");
		periodo=leia.next();
		*/
		
		
		System.out.println("Qual a sua idade? ");
		idade=leia.nextInt();
		System.out.println("Qual o ano escolar está cursando? ");
		anoEscolar=leia.nextInt();
		System.out.println("\n(1) Matematica"
				+ "\n(2) Literatura\n"
				+ "(3) Ciencias da Natureza\n"
				+ "(4) Ciencias Humanas\n"
				+ "Digite o numero da área que você deseja ver:");
		materia=leia.nextInt();
		
	
		if(materia == 1 && anoEscolar == 1)
		{
			ano.matematica("materia");
		}
		else if(materia == 2 && anoEscolar == 1)
		{
			ano.linguagens("materia");
		}
		else if(materia == 3)
		{
			ano.cNatureza("materia");
		}
		else if(materia == 4)
		{
			ano.cHumanas("materia");
		}
		
		else if(materia == 1 && anoEscolar == 2)
		{
			ano2.matematica("materia");
		}
		else if(materia == 2)
		{
			ano2.linguagens("materia");
		}
		else if(materia == 3)
		{
			ano2.cNatureza("materia");
		}
		else if(materia == 4)
		{
			ano2.cHumanas("materia");
		}
		
	
		else if(materia == 1 && anoEscolar == 3)
		{
			ano3.matematica("materia");
		}
		else if(materia == 2)
		{
			ano3.linguagens("materia");
		}
		else if(materia == 3)
		{
			ano3.cNatureza("materia");
		}
		else
		{
			ano3.cHumanas("materia");
		}
		
		ano.setCarga(1100);
		System.out.println("\nCarga Horaria: " +ano.getCarga()+ " horas");
		
		

	
		
		
		
		
		
		

	}

}

import java.util.Scanner;

public class TesteMatematica extends MateriasFixas {

	public TesteMatematica()
	{
		
	}
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Matematica1 mat = new Matematica1();
		String nome;
		int materia;
		String escola;
		int idade;
		int ano;
		
		//Teste 
		System.out.println("Qual o seu nome?: ");
		nome=leia.next();
		System.out.println("Qual o nome da sua escola?: ");
		escola=leia.next();
		System.out.println("idade:");
		idade=leia.nextInt();
		System.out.println("ano: ");
		ano=leia.nextInt();
		System.out.println("materia: ");
		materia=leia.nextInt();
	
		
		if(materia == 1)
		{
			System.out.println(mat.conteudo);
		}

	}

}

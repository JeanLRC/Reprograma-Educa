import java.util.ArrayList;
import java.util.Scanner;

public class Eletiva{
	public static void main(String[] args) {
	ArrayList<String> arte = new ArrayList<>();
	ArrayList<String> historia = new ArrayList<>();
	ArrayList<String> portugues = new ArrayList<>();
	ArrayList<String> matematica= new ArrayList<>();
	int x;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("(1) materias fixas\n(2) materias eletivas\nEscreva o numero da op��o que ver:");
	x=leia.nextInt();
	
	if(x==1)
	{
	
	arte.add("Fotografia");
	arte.add("Ilustra��o");
	arte.add("M�sica");
	arte.add("Dan�a");
	
	historia.add("Hist�ria da Arte");
	historia.add("Turismo");
	historia.add("Arquivologia");
	historia.add("Ci�ncias Sociais");
	
	portugues.add("Biblioteconomia");
	portugues.add("Reda��o Criativa");
	portugues.add("Leitura Din�mica");
	portugues.add("Reda��o Livre");
	
	matematica.add("teste");
	
	System.out.println(arte);
	System.out.println(historia);
	System.out.println(portugues);
	System.out.println(matematica);
	}		
	
	}
}

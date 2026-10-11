package p1;

import java.util.Scanner;

public class film{
	String titre;
	String actp;
	int annp;

	public void ajouterfilm(Scanner sc){
		sc= new Scanner(System.in);
		System.out.println("titre du film :");
		titre = sc.nextLine();
		System.out.println("nom d'acteur principale :");
		actp= sc.nextLine();
		System.out.print("annee de production :");
		annp= sc.nextInt();
		sc.nextLine();
	}
	public void afficherfilm(){
		System.out.println("titre de film :"+titre+"\nacteur principale :"+actp+
				"\nannee de production :"+annp);
	}
}

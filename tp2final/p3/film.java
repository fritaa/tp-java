package p3;

import java.util.Scanner;

public class film{
	String titre;
	String actp;
	int annp;
	int id;
	static int count =0;

	public film(){
		this.id= count ++;
		this.titre="";
		this.actp="";
		this.annp=0;
	}
	
	public film(String titre, String actp,int annp){
		this.id =count++;
		this.titre=titre;
		this.actp=actp;
		this.annp=annp;
	}

	public void ajouterfilm(Scanner sc){
		System.out.println("titre du film :");
		titre = sc.nextLine();
		System.out.println("nom d'acteur principale :");
		actp= sc.nextLine();
		System.out.print("annee de production :");	
		annp= sc.nextInt();		
		sc.nextLine();
	}
	public void afficherfilm(){
		System.out.println("------------------\nid du film :"+id+"\ntitre de film :"+titre+"\nacteur principale :"+actp+
				"\nannee de production :"+annp);
		System.out.println("id :"+id);
	}
}


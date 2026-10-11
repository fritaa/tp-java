package p2;

import java.util.Scanner;

public class testtp2{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);

		System.out.print("nombre des film a ajouter :");
		int n = sc.nextInt();
		sc.nextLine();


		
		String titre;
		String actp;
		int annp;

		film[] films = new film[n];
		for (int i=0;i<n;i++){
			System.out.println("ajouter le film num "+(i+1)+" :");
			System.out.print("titre de film:");
			titre=sc.nextLine();
			System.out.print("acteur principale de film:");
			actp=sc.nextLine();
			System.out.print("annee de production du film:");
			annp=sc.nextInt();
			sc.nextLine();
			films[i]=new film(titre,actp,annp);
		}
		
		for (int i=0;i<n;i++){
			System.out.println("--------------------\nfilm num :"+(1+i));
			films[i].afficherfilm();
		}
	}
}

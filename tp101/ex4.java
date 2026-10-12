import java.util.Scanner;

public class ex4 {
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);

		int somme =0 ;
		int compteur=0;
		
		System.out.println("Entrez des entiers (tapez 0 pour terminer)");

		while (true){
			if(sc.hasNextInt()) {
				int valeur = sc.nextInt();

				if (valeur==0){
					break;
				}

				somme += valeur;
				compteur++;
			}else{
				String saisieInvalide = sc.next();
				System.out.println("Erreur ;"+saisieInvalide+" n est pas un entier valide");
			}
		}
		System.out.println("\n-- resultats --");
		System.out.println("somme totale : "+somme);

		if (compteur > 0){
			double moyenne = (double) somme / compteur;
			System.out.println("nombre d'element : "+compteur);
			System.out.println("moyenne : "+moyenne);
		}else{
			System.out.println("Aucun nombre valide n a ete saisi");
		}

		sc.close();
	}
}

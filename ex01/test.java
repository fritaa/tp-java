package ex01;

public class test{
	public static void main(String[]args){
		etudiant etudiant1= new etudiant("foulen","ben foulen");

		note n1=new note("MAT01",12.5,3);
		note n2=new note("PHY01",10.5,2);
		note n3=new note("IOT01",17.25,1.5);

		etudiant1.ajouternote(n1);
		etudiant1.ajouternote(n2);
		etudiant1.ajouternote(n3);

		System.out.println("premier afficherge");
		etudiant1.afficherinfo();

		System.out.println("suppression de la matiere PHY01");
		boolean suppr1= etudiant1.supnote("PHY01");
		System.out.println("la resultat de suppression :"+suppr1);

		System.out.println("suppression de la matiere PHY02");
		boolean suppr2= etudiant1.supnote("PHY02");
		System.out.println("la resultat de suppression :"+suppr2);


		System.out.println("affichege complet :");
		etudiant1.afficherinfo();
	}
}


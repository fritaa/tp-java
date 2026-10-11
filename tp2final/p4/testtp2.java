package p4;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class testtp2{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);

                System.out.print("nombre des film a ajouter :");
                int nf = sc.nextInt();
		sc.nextLine();

		System.out.print("nombre des projection :");
		int np = sc.nextInt();
		sc.nextLine();

                film[] films = new film[nf];
                for (int i=0;i<nf;i++){
                        System.out.println("ajouter le film num "+(i+1)+" :");
                        System.out.print("titre de film:");
                        String titre=sc.nextLine();
                        System.out.print("acteur principale de film:");
                        String actp=sc.nextLine();
                        System.out.print("annee de production du film:");
                        int annp=sc.nextInt();
                        sc.nextLine();

                        films[i]=new film(titre,actp,annp);
                }

                projection[] projections=new projection[np];
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		for (int i=0;i<np;i++){
                        System.out.print("--------- projection n "+(i+1)+"------");
                        System.out.print("films dispo a choisir :");
                        for(int j=0;j<nf;j++){
				System.out.print("	");
                                films[j].afficherfilm();
                        }

                        System.out.print("choisir un film pour la projection par son id:");
                        int idp=sc.nextInt();
                        sc.nextLine();

			film filmchoisi=null;
                        for (int j=0;j<nf;j++){
                                if (idp==films[j].getid()){
                                        filmchoisi =films[j];
					break;
                                }
			}
			if (filmchoisi == null){
				System.out.print("ID invalide, attribution par defaut du premier film.");
				filmchoisi=films[0];
			}
			System.out.print("Date de projection on format 'dd/MM/yyyy HH:mm' :");
			String saisiedate = sc.nextLine();
			LocalDateTime dateprojection = LocalDateTime.parse(saisiedate, formatter);
			System.out.print("num de la salle");
			String salle =sc.nextLine();
			projections[i] = new projection(filmchoisi, dateprojection, salle);

                }
		//el part el jdida

		System.out.print("===creation du cinema===");
		System.out.print("nom du cinema :");
		String nomcinema= sc.nextLine();
		cinema moncinema = new cinema(nomcinema);

		System.out.print("---ajout des projections au cinema "+moncinema.getname()+"-----");
		System.out.print("combien de projections a ajouter a ce cinema :");
		int nbajout = sc.nextInt();
		sc.nextLine();

		for (int k=0;k<nbajout;k++){
			System.out.println("projections disponibles :");
			for (int i=0;i<np;i++){
				System.out.print((i+1)+" .");
				projections[i].afficherprojection();
			}
			System.out.print("entrez le num de la projection a ajouter au cinema :");
			int choix = sc.nextInt();
			sc.nextLine();

			if (choix >=1 && choix <=np){
				moncinema.ajouterprojection(projections[choix-1]);
			} else {
				System.out.println("num invalide");
			}
		}

		moncinema.afficherprojections();
	}
}	

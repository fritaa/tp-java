package p3;
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
                                if (idp==films[j].id){
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

		System.out.print("===liste de tt les projection===");
                for(int i=0;i<np;i++){
			System.out.print("---projectin n"+(i+1)+"------");
                        projections[i].afficherprojection();
                }
        }
} 

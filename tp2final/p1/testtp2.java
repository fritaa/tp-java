package p1;

import java.util.Scanner;

public class testtp2{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);

		System.out.print("nombre des film a ajouter :");
		int n = sc.nextInt();
		sc.nextLine();

		film[] films = new film[n];
		for (int i=0;i<n;i++){
			System.out.println("ajouter le film num "+(i+1)+" :");
			films[i]= new film();
			films[i].ajouterfilm(sc);
		}
		
		for (int i=0;i<n;i++){
			System.out.println("film num :"+(1+i));
			films[i].afficherfilm();
		}
	}
}

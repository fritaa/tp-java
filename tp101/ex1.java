import java.util.Scanner;

public class ex1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("entrez le prenom :");
		String prenom = sc.nextLine();

		System.out.println("entrez votre age");
		int age =sc.nextInt();

		int agedans10ans = age +10;

		System.out.println("bonjour "+prenom+" dans 10 ans vous aure "+agedans10ans+" ans ");
		sc.close();
	}
}




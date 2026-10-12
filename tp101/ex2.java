import java.util.Scanner;

public class ex2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("la 1ere note :");
		double n1 = sc.nextDouble();

		System.out.println("la 2ere note :");
		double n2 = sc.nextDouble();

		System.out.println("la 3ere note :");
		double n3 = sc.nextDouble();

		double moy = (n1+n2+n3)/3;
		if(moy>10)
			System.out.println("admiiiiiiiis yami yami");
		else
			System.out.println("jad alikkkkkk yatk douda");
		sc.close();
	}
}

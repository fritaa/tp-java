package ex01;

import java.util.ArrayList;

public class etudiant{
	private String nom;
	private String prenom;
	private ArrayList<note>notes;

	public etudiant (String nom,String prenom){
		this.nom=nom;
		this.prenom=prenom;
		this.notes = new ArrayList<note>();
	}

	public String getnom(){
		return nom;
	}
	public String getprenom(){
		return prenom;
	}
	public void ajouternote(note n){
		notes.add(n);
	}

	public boolean supnote(String codemat){
		for (int i=0;i<notes.size();i++){
			if (notes.get(i).getcodemat().equals(codemat)){
				notes.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public double calculermoy(){
		double mn=0;
		double mc=0;
		for (note n : notes){
			mn += n.getnoteob() * n.getcoef();
			mc+= n.getcoef();
		}
		if(mc==0){
			return 0;
		}
		return mn/mc;
	}

	public void afficherinfo(){
		System.out.println("nom :"+nom);
		System.out.println("prenom :"+prenom);
		System.out.println("=========notes========");
		for (note n : notes){
			n.afficher();
		}
		System.out.println("moy :"+calculermoy());
	}
}

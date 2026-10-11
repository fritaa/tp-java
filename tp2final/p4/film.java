package p4;

import java.util.Scanner;

public class film{
	private String titre;
	private String actp;
	private int annp;	
	private int id;
	private static int count =0;

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

	public String gettitre(){
		return titre;
	}
	public void settitre(String titre){
		this.titre=titre;
	}

	public String getactp(){
		return actp;
	}
	public void setactp(String actp){
		this.actp=actp;
	}
	public int getannp(){
		return annp;
	}
	public void setannp(int annp){
		this.annp=annp;
	}
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id=id;
	}
	public static int getcount(){
		return count;
	}
	public void afficherfilm(){
		System.out.print("ID : " + id + " | Titre : " + titre + " | Acteur principal : " + actp + " | Année : " + annp);
	}
}

package ex01;

public class note{
	private String codemat;
	private double noteob;
	private double coef;

	public note(String codemat,double noteob,double coef){
		this.codemat=codemat;
		this.noteob=noteob;
		this.coef=coef;
	}

	public String getcodemat(){
		return codemat;
	}
	public void setcodemat(String codemat){
		this.codemat=codemat;
	}
	public double getnoteob(){
		return noteob;
	}
	public double getcoef(){
		return coef;
	}
	public void setnoteob(double noteob){
		this.noteob=noteob;
	}
	public void setcoef(double coef){
		this.coef=coef;
	}
	public void afficher(){
		System.out.println("code de matier :"+codemat);
		System.out.println("note obtenue :"+noteob);
		System.out.println("coefficient :"+coef);
	}
}

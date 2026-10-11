package p4;

import java.util.ArrayList;
import java.util.List;

public class cinema{
	private String name;
	private List<projection> projections;
       	
	public cinema(String name){
		this.name=name;
		this.projections=new ArrayList<>();
	}

	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}

	public List<projection> getprojections(){
		return projections;
	}
	public void setprojections(List<projection> projections){
		this.projections=projections;
	}

	public void ajouterprojection(projection p){
		if (p.getmycinema()==null){
			projections.add(p);
			p.setmycinema(this);
			System.out.println("projection ajoutee avec succee au cinema "+name);
		} else {
			System.out.println("erreur : cette projection est deja associee a un cinema");
		}
	}
	public void afficherprojections() {
        	System.out.println("\n========================================");
        	System.out.println("Cinéma : " + name);
        	System.out.println("========================================");
        	if (projections.isEmpty()) {
        	    System.out.println("Aucune projection programmée dans ce cinéma.");
        	} else {
        	    for (int i = 0; i < projections.size(); i++) {
                	System.out.println("\n--- Projection " + (i + 1) + " ---");
                	projections.get(i).afficherprojection();
            		}
        	}
    	}
}


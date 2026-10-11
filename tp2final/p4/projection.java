package p4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class projection{
	private film film;
	private LocalDateTime d_h_projection;
	private String s_projection;
	private cinema mycinema;


	public projection(film film,LocalDateTime d_h_projection, String s_projection){
		this.film=film;
		this.d_h_projection=d_h_projection;
		this.s_projection=s_projection;
		this.mycinema = null;
	}

	public film getfilm(){
		return film;
	}
	public void setfilm(film film){
		this.film = film;
	}
	public LocalDateTime getd_h_projection(){
		return d_h_projection;
	}
	public void setd_h_projection(LocalDateTime d_h_projection){
		this.d_h_projection=d_h_projection;
	}
	public String gets_projection(){
		return s_projection;
	}
	public void sets_projection(String s_projection){
		this.s_projection=s_projection;
	}
	public cinema getmycinema(){
		return mycinema;
	}
	public void setmycinema(cinema mycinema){
		this.mycinema=mycinema;
	}

	public void afficherprojection(){
		DateTimeFormatter f =DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String dateFormatee =d_h_projection.format(f);

		System.out.println("Salle :"+s_projection);
		if (mycinema == null){
			System.out.print("cinema associe : "+mycinema.getname());
		}
		System.out.println("date et heur :"+dateFormatee);
		System.out.println("film projecte:");
		film.afficherfilm();
	}
}


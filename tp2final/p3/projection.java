package p3;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class projection{
	film film;
	LocalDateTime d_h_projection;
	String s_projection;

	public projection(film film,LocalDateTime d_h_projection, String s_projection){
		this.film=film;
		this.d_h_projection=d_h_projection;
		this.s_projection=s_projection;
	}

	public void afficherprojection(){
		DateTimeFormatter f =DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String dateFormatee =d_h_projection.format(f);

		System.out.println("Salle :"+s_projection);
		System.out.println("date et heur :"+dateFormatee);
		System.out.println("film projecte:");
		film.afficherfilm();
	}
}


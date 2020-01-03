package controle;

import java.util.ArrayList;
import java.util.List;

import model.Personne;

public class Donnee {
	public static List<Personne> p = new ArrayList<>();
	static {
		for (int i = 0; i < 12; i++)
			p.add(new Personne("firstname_" + i, "lastname_" + i, "pseudo_" + i, "email_" + i, "tel_" + i,
					"password_" + i));
	}
	

}

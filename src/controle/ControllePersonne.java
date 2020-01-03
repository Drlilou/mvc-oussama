package controle;

import java.util.List;

import model.Personne;

public class ControllePersonne {

	public List<Personne> personnes;

	public ControllePersonne() {
		personnes = Donnee.p;

	}

	public boolean existPersonne(Personne p) {
		return personnes.contains(p);
	}

	public boolean ajouterPerson(Personne p) {
		if (existPersonne(p))
			return false;
		return personnes.add(p);
	}

	
}

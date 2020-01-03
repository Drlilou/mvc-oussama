package model;

public class Personne {
	private String nom, prenom, pseudo, email, tel, mdp;

	public Personne(String pseudo, String mdp) {
		this("", "", pseudo, "", "", mdp);
	}

	public Personne(String nom, String prenom, String pseudo, String email, String tel, String mdp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.email = email;
		this.tel = tel;
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nom + " " + prenom + " " + pseudo + " " + email + " " + tel + " " + mdp;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Personne) {
			Personne p = (Personne) obj;
			boolean b = (p.getNom().equals(nom) && p.getPrenom().equals(prenom)
					|| p.getPseudo().equals(pseudo)) && (p.getEmail().equals(email) || p.getTel().equals(tel))
					&& p.getMdp().equals(mdp);
			boolean b2 = p.getPseudo().equals(pseudo) && p.getMdp().equals(mdp);
			boolean b3 = p.getPseudo().equals(pseudo);
			return b || b2 || b3;
		}
		return false;
	}
}

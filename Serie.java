package dk.ns.series;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titre;
    private List<Saison> saisons;
	
    public Serie(String titre) {
		super();
		this.titre = titre;
		this.saisons = new ArrayList<>();
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Saison> getSaisons() {
		return saisons;
	}

    public void ajouterSaison(Saison saison) {
        saisons.add(saison);
	}

	@Override
	public String toString() {
		return "Serie [titre=" + titre + ", saisons=" + saisons + "]";
	}
}


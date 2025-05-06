package routes;

public class Autoroute extends Route {
    private int nbEchangeurs;

    public Autoroute(int nbKilometres, int nbPonts, int nbPassagesFauniques, int nbEchangeurs) {
        super(nbKilometres, nbPonts, nbPassagesFauniques, true); // accotements toujours asphaltés
        this.nbEchangeurs = nbEchangeurs;
    }

    @Override
    public double calculerCout() {
        double cout = 0;
        cout += super.getNbKilometres() * 6.8;
        cout += super.getNbPonts() * 6;
        cout += super.getNbPassagesFauniques() * 0.7;
        cout += super.getNbKilometres() * 0.2;
        cout += nbEchangeurs * 7;
        return cout;
    }

    // Ajoute les getters manquants
    public int getNbEchangeurs() { return nbEchangeurs; }
}

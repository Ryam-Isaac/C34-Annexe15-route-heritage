package routes;

public class Route {
    private int nbKilometres;
    private int nbPonts;
    private int nbPassagesFauniques;
    private boolean accotementsAsphaltes;

    public Route(int nbKilometres, int nbPonts, int nbPassagesFauniques, boolean accotementsAsphaltes) {
        this.nbKilometres = nbKilometres;
        this.nbPonts = nbPonts;
        this.nbPassagesFauniques = nbPassagesFauniques;
        this.accotementsAsphaltes = accotementsAsphaltes;
    }

    public double calculerCout() {
        double cout = 0;
        cout += nbKilometres * 3.4;
        cout += nbPonts * 6;
        cout += nbPassagesFauniques * 0.7;
        if (accotementsAsphaltes) {
            cout += nbKilometres * 0.1;
        }
        return cout;
    }
}

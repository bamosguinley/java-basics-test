
public class App {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("bug","sportive",500,"gris");
        System.out.println(voiture.accelerer());
        System.out.println(voiture.ralentir());
        System.out.println(voiture.tourner());
        System.out.println(voiture.freiner());
        System.out.println(voiture.getCouleur());
        System.out.println(voiture.couleur);
    }
}
public class Voiture {
    
    private String type;
    private String modele;
    private double prix;
    private String couleur;

    public Voiture(String type, String modele, double prix, String couleur) {
        this.type = type;
        this.modele = modele;
        this.prix = prix;
        this.couleur = couleur;
    }

    public String accelerer() {
        return "J'accelere";
    }
    public String ralentir() {
        return "Je realentis";
    }
    public String tourner() {
        return "Je tourne";
    }
    public String freiner() {
        return "Je freine";
    }
  

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    


    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
    

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}

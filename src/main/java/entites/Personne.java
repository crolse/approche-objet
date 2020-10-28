package entites;

public class Personne {
    static String nom ;
    static String prenom ;
    static String adressePostale ;

    public Personne(String nom, String prenom){
        this.nom = nom ;
        this.prenom = prenom ;
    }

    public Personne(String nom, String prenom , String adressePostale){
        this.nom = nom ;
        this.prenom = prenom ;
        this.adressePostale = adressePostale ;
    }

    public static void nomFamilleMajuscule (String nom , String prenom) {
        System.out.println(prenom + nom.toUpperCase());
    }

    public static void setNom (String nomNouveau) {
        nom = nomNouveau ;

    }

    public static void setPrenom (String prenomNouveau) {
        prenom = prenomNouveau ;

    }

    public static void setAdresse (String adresseNouveau) {
        adressePostale = adresseNouveau ;

    }

    public static String getNom () {
        return nom ;

    }

    public static String getPrenom () {
        return prenom ;

    }
    public static String getAdresse () {
        return adressePostale ;

    }


    public static void main(String[] args) {
        Personne personneA = new Personne("barre" ,"gregoire" , "44190") ;
        nomFamilleMajuscule("barre" , "gregoire");
    }
}

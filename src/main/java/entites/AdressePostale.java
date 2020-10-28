package entites;
//elle doit avoir les 4 attributs suivants : numéro de rue, libellé de la rue, code postal et ville.
public class AdressePostale {
    String numeroRue ;
    String libelleRue;
    String codePostal;
    String ville;

    public AdressePostale(String numeroRue, String libelleRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;


    }
}

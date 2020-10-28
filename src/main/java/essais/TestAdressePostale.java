package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresseA = new AdressePostale("9" ,"rue du talent" , "44190" , "Sochaux") ;
        AdressePostale adresseB = new AdressePostale("10" ,"par ici" , "0000" , "VersLaBas") ;
        System.out.println(adresseA);
        System.out.println(adresseB);
    }
}

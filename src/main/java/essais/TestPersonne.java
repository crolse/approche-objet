package essais;

import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personneA = new Personne("pas" , "moi" ,"44190") ;
        Personne personneB = new Personne("bibou" , "blop" , "44190") ;
        personneA.setAdresse("4400");
        System.out.println(personneA.getAdresse());
    }

}

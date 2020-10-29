package fr.diginamic.banque.entites;

public class Compte {
    public int numeroCompte ;
    public double soldeCompte ;



    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte ;
        this.soldeCompte = soldeCompte ;

    }

    public String toString() {
        return "Compte numero " + this.numeroCompte +
                " : proprietaire " + this.soldeCompte ;
    }
}

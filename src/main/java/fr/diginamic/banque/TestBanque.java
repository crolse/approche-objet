package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;
public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(14444 , 14.33) ;
        System.out.println(compte);
    }
}

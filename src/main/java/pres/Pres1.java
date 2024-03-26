package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        //  l'injection des dépendances
        //  a. Par instanciation statique
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); // Injection via le constructeur
        System.out.println("Resultat = "+ metier.calcul());

    }

}



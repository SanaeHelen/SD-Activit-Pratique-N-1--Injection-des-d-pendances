package pres;

import dao.IDao;
import metier.IMetier;

import java.util.Scanner;
import java.lang.reflect.*;

public class Pres22 {
    public static void main(String[] args) throws Exception {

        //  l'injection des dépendances
        //  b. Par instanciation dynamique

        // Création d'une instance de Scanner pour la saisie utilisateur depuis la console
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de fournir le nom de la classe de la couche DAO
        System.out.print("Donner la classe de la couche DAO :");
        String daoClassName = scanner.nextLine(); // Lecture du nom de la classe DAO fourni par l'utilisateur

        // Chargement dynamique de la classe DAO à partir de son nom
        Class cDao = Class.forName(daoClassName);

        // Création d'une instance de la classe DAO en utilisant son constructeur par défaut
        IDao dao=(IDao) cDao.getConstructor().newInstance();

        // Demande à l'utilisateur de fournir le nom de la classe de la couche Métier
        System.out.print("Donner la classe de la couche Metier :");
        String metierClassName= scanner.nextLine(); // Lecture du nom de la classe Métier fourni par l'utilisateur

        // Chargement dynamique de la classe Métier à partir de son nom
        Class cMetier = Class.forName(metierClassName);

        // Création d'une instance de la classe Métier en utilisant son constructeur par défaut
        IMetier metier =(IMetier) cMetier.getConstructor().newInstance();

        // Récupération de la méthode setDao de la classe Métier
        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);

        // Injection du DAO dans la classe Métier en utilisant la méthode setDao
        setDao.invoke(metier,dao); // Injection des dépendances

        // Appel de la méthode calcul() de la classe Métier et affichage du résultat
        System.out.println("Resultat = "+ metier.calcul());
    }
}




package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        //  l'injection des dépendances
        //  b. Par instanciation dynamique

        // Ouverture du fichier de configuration pour la lecture
        Scanner scanner = new Scanner(new File("config.txt"));

        // Lecture du nom de la classe du DAO à partir du fichier de configuration
        String daoClassName = scanner.nextLine();

        // Chargement dynamique de la classe du DAO à partir de son nom
        Class cDao = Class.forName(daoClassName);

        // Création d'une instance du DAO en utilisant le constructeur par défaut
        IDao dao=(IDao) cDao.getConstructor().newInstance();

        // Lecture du nom de la classe du métier à partir du fichier de configuration
        String metierClassName= scanner.nextLine();

        // Chargement dynamique de la classe du métier à partir de son nom
        Class cMetier = Class.forName(metierClassName);

        // Création d'une instance du métier en utilisant le constructeur par défaut
        IMetier metier =(IMetier) cMetier.getConstructor().newInstance();

        // Récupération de la méthode setDao de la classe métier
        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);

        // Injection du DAO dans la classe métier en utilisant la méthode setDao
        setDao.invoke(metier,dao); // Injection des dependances

        // Appel de la méthode calcul() de la classe métier et affichage du résultat
        System.out.println("Resultat = "+ metier.calcul());
    }
}

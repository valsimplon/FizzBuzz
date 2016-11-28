package co.simplon.prairie;


/**
 * Classe de gestion FizzBuzz gérant l'affichage d'une liste d'entiers en respectant les règles suivantes :
 * 1/ si l'entier fourni est un multiple de 3, afficher la chaîne de caractères "Fizz"
 * 2/ si l'entier fourni est un multiple de 5, afficher la chaîne de caractères "Buzz"
 * 3/ dans tout autre cas, afficher l'entier tel quel
 */
public class FizzBuzz {

    /**
     * Constructeur
     */
    public FizzBuzz() {
    }

    /**
     * Affichage sur la sortie standard (console) de la liste des entiers entre l'index de début
     * et de fin, avec prise en compte des règles de substitutions fournies
     *
     * @param debut Index (entier) de début pour l'affichage
     * @param fin   Index (entier) de fin pour l'affichage
     */
    public void afficherListeEntiers(int debut, int fin) {

        int i;
        
        for (i = debut; i <= fin; i++) {
            System.out.println(i + "   " + this.determinerCorrespondance(i));
        }
    }

    /**
     * ce module attribue un string selon le modulo de l'entier (pair/impair)
     * @param entier
     * @return
     */
    protected String determinerCorrespondance(int entier) {
        
        // si modulo 3 alors FIZZ
        //si modulo 5 alors BUZZ
        //sinon ecrire entier


        if (entier == 0)
        {
            return "0";
        }

        if ((entier % 5 == 0) && (entier % 3 == 0))
        {
          return "FizzBuzz";
        }
        if (entier % 3 == 0)
        {
          return "Fizz";
        }
        if (entier % 5 == 0)
        {
          return "Buzz";
        }
        return Integer.toString(entier);
    }

}

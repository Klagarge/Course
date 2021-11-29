package C08_Structures_de_donnees.C082_Tableaux;

/**
 * @author Rémi Heredero
 */
public class Exercice1 {
    public static void main(String[] args) {
        
        int[] foo = {10, 11, 12};
        for (int i = 0; i < foo.length; i++) {
            System.out.println(foo[i]);
        }

        String[] bar = new String[3];
        bar[0] = "Hello";
        bar[1] = bar[0];
        for (String string : bar) {
            System.out.println(string);
        }
    }
}

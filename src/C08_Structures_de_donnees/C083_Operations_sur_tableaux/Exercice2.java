package C08_Structures_de_donnees.C083_Operations_sur_tableaux;
/**
 * @author Rémi Heredero
 * @Klagarge
 */
public class Exercice2 {
    public static void main(String[] args) {
        
        int[] ex2_1 = {2, 5, 3, 1};
        int grand = 0;
        for (int i : ex2_1) {
            grand = i>grand ? i:grand;
        }
        System.out.println("Exercice 2.1: " + grand);

        String[] ex2_2 = {"hello", "je suis", "edmund"};
        int e = 0;
        for (String s : ex2_2) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'e') {
                    e++;
                }
            }
        }
        System.out.println("Exercice 2.2: " + e);

        int[] v1 = {1,2,3};
        int[] v2 = {4,3,2};
        int [] sum = add(v1, v2);
        for (int i : sum) {
            System.out.println(i);
        }



    }

    /**
     * @author Rémi Heredero
     * @param a tableau d'entrée a
     * @param b tableau d'entrée b
     * @return somme des deux tableaux d'entrée
     */
    public static int[] add(int[] a, int[] b) {
        if (a.length != b.length) {
            return null;
        }

        int[] tmp = new int[a.length];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = a[i] + b[i];
        }
        return tmp;
    }
}
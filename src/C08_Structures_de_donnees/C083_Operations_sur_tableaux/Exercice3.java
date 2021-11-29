package C08_Structures_de_donnees.C083_Operations_sur_tableaux;

/**
 * @author Rémi Heredero
 * @Klagarge
 */
public class Exercice3 {
    public static void main(String[] args) {
        
        double[] a = {1.2, 3.2, 4.4, 5.5};
        double[] b = {1.2, 2.1, 3.3, 2.5, 4.5};

        int Ra = isSorted(a); // returns -1, the array is sorted
        int Rb = isSorted(b); // returns 3, as 2.5 is < than 3.3

        System.out.println(Ra);
        System.out.println(Rb);

    }

    public static int isSorted(double[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                return i;
            }
        }
        return -1;
    }
}

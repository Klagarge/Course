package C08_Structures_de_donnees.C083_Operations_sur_tableaux;

/**
 * @author Rémi Heredero
 */
public class App {
    public static void main(String[] args) throws Exception {
        int[][] foo = new int[3][3];
        for (int[] is : foo) {
            for (int is2 : is) {
                is2 = 1;
                System.out.println(is2);
            }
        }
    }
}

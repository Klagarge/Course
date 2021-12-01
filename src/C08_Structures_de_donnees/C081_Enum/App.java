package C08_Structures_de_donnees.C081_Enum;

/**
 * @author Rémi Heredero
 */
enum Glace {VANILLE, CHOCOLAT, FRAISE, MANGUE};
// enum Cat {MINOU, CHATONS, CONNAIS_PAS_D_AUTRES, TOTO};
public class App {
    public static void main(String[] args) throws Exception {
        
        Glace favorite = Glace.VANILLE;
        // Cat simba = Cat.CHATONS;
        for (int i = 0; i < 4; i++) {
            switch (favorite) {
                case VANILLE:
                    System.out.println("Vanille");
                    favorite = Glace.CHOCOLAT;
                    break;
                    
                case CHOCOLAT:
                    System.out.println("Chocolat");
                    favorite = Glace.FRAISE;
                    break;
                    
                case FRAISE:
                    System.out.println("Fraise");
                    favorite = Glace.MANGUE;
                    break;
                    
                default:
                    System.out.println("Mangue");
                    favorite = Glace.VANILLE;
                    break;
            }
        }
    }
}

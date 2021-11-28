package C05_Boucle_et_fonctions;

import library.*;

public class C05EX01a {
    public static void main(String[] args) {
        
        int a, b, c;
        System.out.print("Veuillez entrer la première valeur: ");
		a = Input.readInt();
		System.out.print("Veuillez entrer la deuxième valeur: ");
		b = Input.readInt();
		System.out.print("Veuillez entrer la troisième valeur: ");
		c = Input.readInt();
        int max = a>b ? a:b;
        max = max>c ? max:c;
        System.out.println(max);

    }
}

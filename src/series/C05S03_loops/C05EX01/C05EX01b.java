package series.C05S03_loops.C05EX01;

import library.*;

public class C05EX01b {
    public static void main(String[] args) {
        double a = Input.readDouble();
        if (a>=0) {
            System.out.println(Math.sqrt(a));
        } else {
            System.out.println("error");
        }
    }
}

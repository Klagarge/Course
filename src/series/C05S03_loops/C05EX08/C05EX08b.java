package series.C05S03_loops.C05EX08;

public class C05EX08b {
    public static void main(String[] args) {
        double sum = 0;
        int i;
        for (i = 0; i <= 1000; i++) {
            sum += i;
        }
        double average = sum/(i-1);
        System.out.println(average);
    }
}

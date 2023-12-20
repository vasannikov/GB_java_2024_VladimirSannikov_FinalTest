package seminar1;

public class Seminar1 {
    public static void main(String[] args) {
        int a = 10;
        int c = 0;
        for (int i = 1; i <= 10; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        System.out.println("Result = " + c);

    }
}

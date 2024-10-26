import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.compareTo(s2) > 0) {
            System.out.println("1");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
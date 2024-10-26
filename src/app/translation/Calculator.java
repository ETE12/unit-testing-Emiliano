import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            var s1 = in.next();
            var s2 = in.next();
 
            var verificacion = new StringBuilder(s1).reverse().toString();
 
            if (verificacion.equals(s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
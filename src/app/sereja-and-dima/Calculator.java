import java.util.Scanner;
 
public class Calculator {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
    
        int n = in.nextInt();
 
    
        int[] value = new int[n];
 
    
        for (int i = 0; i < value.length; i++) {
            value[i] = in.nextInt();
        }
 
        
        int l = 0, r = n - 1;
        int s = 0, d = 0;
 
        boolean p = true;
 
        while (l <= r) {
            if (value[l] >= value[r]) {
                if (p) {
                    s += value[l];
                } else {
                    d += value[l];
                }
                l++; 
            } else {
                if (p) {
                    s += value[r];
                } else {
                    d += value[r];
                }
                r--; 
            }
            p = !p;
        }
 
        System.out.println(s + " " + d);
 
        in.close();
    }
}
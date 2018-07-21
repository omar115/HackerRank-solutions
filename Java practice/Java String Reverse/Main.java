import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String str = sc.next();
        
        String rev_word = new StringBuffer(str).reverse().toString();
        
        System.out.println(str.equals(rev_word) ? "Yes" : "No");
        
    }
    
}

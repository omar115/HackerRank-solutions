import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        str = str.trim();
        
        if (str.length() == 0) {
            System.out.println(0);
            return;
        }
        
        //split all non-alphabetic characters
        String [] tokens = str.split("[^a-zA-Z]+");
        
        System.out.println(tokens.length);
        
        for (String item : tokens) {
            System.out.println(item);
        }
    }
}   

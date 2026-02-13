
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // This line prints "Hello, World!" to the console
        System.out.println("Hello, World!"); 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
           for(int j=0;j<=i;j++){
             System.out.print("* ");
           }
    
           System.out.println();
        }

    }
}
import java.util.Scanner;


class stack {
    int size;
    int top;
    int[] arr;
    
}
interface Printstament{
    void print(String name);
}
class Dog implements  Printstament{
    
    public void print(String name){
        System.out.println(name+" is a dog.");
    }
}


class Cat implements  Printstament{
    public void print(String name){
        System.out.println(name+" is a cat.");
    }
}
class Cow extends Cat implements Printstament{
    public void print(String name){
        System.out.println(name+" is a cow.");
    }       
 
    
}

public class abstraction   {
    public static void pr(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("This is an example of abstraction in Java.");
        pr("Chirag");
    }
}

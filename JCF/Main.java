public class Main {
    public static void main(String[] args) {
        System.out.println("hi, I am Chirag!");
        String str =  new String("Hello");
        System.out.println(str);
        String s1 = "Hello";
        String s2 = s1;
        s2 = s2.concat(" World");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println(s1 == s2); // true, because string literals are interned
        System.out.println(s1.equals(s2)); // true, because content is the same
        // LinkedList<Integer> list =  new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);


        System.out.println(s1 == str); // true, because string literals are interned
        System.out.println(s1.equals(str)); // true, because content is the same
        
    }
}

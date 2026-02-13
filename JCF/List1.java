package JCF;
import java.util.ArrayList;

public class List1 {

    public static void ListImplementation(){
    //    "List" is an interface in Java that represents an ordered collection of elements. It allows duplicate elements and maintains the insertion order. The List interface is part of the Java Collections Framework and provides various methods for manipulating lists.
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
        list.add("Eve");
        // list.remove(2);
        for (String name : list) {
            System.out.println(name);
        }
        while


        System.out.println(list);
    }

    public static void showNotification() {
        String notification = "This is a notification.";
        System.out.println(notification);
    }
    public static void main(String []args){
        String notification = "This is a notification.";
        System.out.println(notification);
        ListImplementation();

    }
    
    
}

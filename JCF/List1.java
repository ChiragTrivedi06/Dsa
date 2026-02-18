import java.util.ArrayList;
//  class StringWrapper{
//     String name;
//     StringWrapper(String name) {
//         name = this.name;
//     }
//     public void setter(String str){
//         name= str;
//     }
//     public String getter(){
//         return name;
//     }


// }
public class List1 {

    static  class StringWrapper{
    String name;
    StringWrapper(String name) {
     this.name = name;
    }
    public void setter(String str){
        name= str;
    }
    public String getter(){
        return name;
    }


}

    public static void ArrayListImplementation(){
    //    "List" is an interface in Java that represents an ordered collection of elements. It allows duplicate elements and maintains the insertion order. The List interface is part of the Java Collections Framework and provides various methods for manipulating lists.
        //  autoboxing
    // ArrayList<String> list = new ArrayList<>();
        // list.add("Alice");
        // list.add("Bob"); au
        // list.add("Charlie");
        // list.add("David");
        // list.add("Eve");
        // list.remove(2);

        // Looping over list

        // for (String name : list) {
        //     System.out.println(name);
        // }

        // contains check element exist or not -- return true or false.   
        // System.out.println(list.contains("Alice"));

        // // to add element on index
        // list.add(0,"Alice1");
        // System.out.println(list);

        // // replace element in index
        // System.out.println(list.set(0,"Chirag"));
        // System.out.println(list.set(2,"Chirag"));

    
        // System.out.println(list);

        // // get element of index
        // System.out.println(list.get(0));
        // // find list size
        // System.out.println(list.size());

        // last index of element
        // System.out.println(list.lastIndexOf("Chirag"));

        // // define new ArrayList
        // ArrayList<Integer> list1 = new ArrayList<>();

        // list1.add(1);
        // list1.add(6);
        // list1.add(2);
        // list1.add(5);
        // System.out.println(list1);
        

        // Collections class to sort arraylist
    //     Collections.sort(list1);
    //     System.out.println(list1);

    //     // sort list in reverse order
    //     list1.sort(Comparator.reverseOrder());
    //     System.out.println(list1);

        // ArrayList<StringWrapper> list = new ArrayList<>();


        // list.add( new StringWrapper("chirag"));  //boxing
        // System.out.print(list.get(0).getter()); //unboxing

        int a = 10;
        System.out.println(a); // autoboxing
        Integer b = a; // autoboxing
        System.out.println(b);
        System.out.println(b.getClass()); // autoboxing
        // System.out.println(a.getClass()); // autoboxing
        System.out.println(b == a); // true, because of autoboxing
        System.out.println(b.equals(a)); // true, because of autoboxing

    }
    public static void printList(ArrayList<String> list){
       
        while (true) { 
            if (list.isEmpty()) {
                break;
            }
            String name = list.remove(0);
            System.out.println(name);                               
        }   
    }
    public static void main(String []args){
        ArrayListImplementation();

    }
    
    
}

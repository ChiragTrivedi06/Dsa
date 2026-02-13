package linkedlist;

public class ListImplementation {
    class Node {
        int data;
        String name;
        Node next;

        Node(int data, String name) {
            this.data = data;
            this.next = null;
            this.name = name;
        }
    }

    Node head = null;

    public void insertNode(int data, String name){
        if(head == null){
            head = new Node(data,name);
          
        } else {
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data,name);
        }

    }
    public void printlist(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " " + currentNode.name + " -> ");
            currentNode = currentNode.next;
        }
    }

    
    public static void main(String[] args) {
        ListImplementation list = new ListImplementation();
        list.insertNode(1, "Alice");
        list.insertNode(2, "Bob");
        list.insertNode(3, "Charlie");
        list.insertNode(4, "David");
        list.insertNode(5, "Eve");
        list.printlist();
        
        System.out.println();
    }
}

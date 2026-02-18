import java.util.LinkedList;
public class StackImplementation {
    public static void main(String[] args) {
        System.out.println("let code");
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // System.out.println(stack);
        // System.out.println(stack.pop());
        // System.out.println(stack);
        // System.out.println(stack.peek());
        // System.out.println(stack);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.offer(1);
        System.out.println(list);
        list.push(4);
        System.out.println(list);
    }
    
}

package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task3_Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println(stack.peek());
        System.out.println();

        while (stack.iterator().hasNext()) {
            System.out.println(stack.pop());
        }
    }
}

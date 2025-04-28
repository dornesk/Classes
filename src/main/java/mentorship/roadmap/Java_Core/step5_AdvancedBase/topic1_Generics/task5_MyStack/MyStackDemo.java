package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

public class MyStackDemo {

    public static void main(String[] args) {

        MyStack<Integer> s = new MyStack<>();

        s.push(1);
        s.push(3);
        s.push(2);

        System.out.println("Возврат верхнего элемента без удаления: " + s.peek());
        System.out.println("Удаление и возврат верхнего элемента: " + s.pop());
        System.out.println("Возврат верхнего элемента без удаления: " + s.peek());
    }
}

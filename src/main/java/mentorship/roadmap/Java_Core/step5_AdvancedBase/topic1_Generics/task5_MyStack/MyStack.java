package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

    private List<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return elements.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return elements.getLast();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

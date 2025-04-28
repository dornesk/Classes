package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class Box<T> {

    private T value;

    public Box() {
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

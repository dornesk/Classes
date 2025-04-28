package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class BoxDemo {

    public static void main(String[] args) {

        Box b = new Box<String>();

        b.set("str");
        System.out.println(b.get());

        b.set("11111");
        System.out.println(b.get());
    }
}

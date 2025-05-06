package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task5_Operation;

public class OperationDemo {

    public static void main(String[] args) {
        for (Operation operation : Operation.values()) {
            System.out.println(operation + ": " + String.format("%.1f",operation.apply(2,0)));
        }
    }
}

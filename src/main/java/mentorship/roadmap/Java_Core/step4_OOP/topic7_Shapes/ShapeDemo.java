package mentorship.roadmap.Java_Core.step4_OOP.topic7_Shapes;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape circle = new Circle(3);
        Shape rect = new Rectangle(4,6);

        System.out.println("Площадь круга: " + circle.getArea() + "\nПериметр круга :" + circle.getPerimeter());
        System.out.println("Площадь прямоугольника: " + rect.getArea() + "\nПериметр прямоугольника :" + rect.getPerimeter());
    }
}

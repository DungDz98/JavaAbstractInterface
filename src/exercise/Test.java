package exercise;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Before-resize: ");
        System.out.println(rectangle);
        rectangle.resize(50);
        System.out.println("After-resize: ");
        System.out.println(rectangle);
    }
}

package practice.circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.0, "Red", true);
        circles[1] = new Circle(3.6, "Blue", false);
        circles[2] = new Circle(3.5, "Indigo", true);

        System.out.println("Before-sort: ");
        for (Circle circle: circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                if (o1.getRadius() > o2.getRadius()) return 1;
                else if (o1.getRadius() < o2.getRadius()) return -1;
                else return 0;
            }
        });

        System.out.println("After-sort: ");
        for (Circle circle: circles) {
            System.out.println(circle);
        }
    }
}

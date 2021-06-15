package exercise;


public class Test2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();

        for (Shape shape: shapes) {
            if (shape instanceof Colorable) {
                System.out.println(shape);
                ((Colorable) shape).howtoColor();
            } else {
                System.out.println(shape);
            }
        }
    }
}

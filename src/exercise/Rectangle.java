package exercise;

public class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle() {}

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double setArea() {
        return width * length;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.getWidth() +
                ", length=" + this.getLength() +
                "}, which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width *= 1 + percent/100;
        this.length *= 1 + percent/100;
    }
}

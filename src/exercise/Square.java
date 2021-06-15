package exercise;

public class Square extends Rectangle implements Resizable, Colorable {
    Square() {

    }

    Square(double side) {
        super(side, side);
    }

    Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four side.");
    }
}

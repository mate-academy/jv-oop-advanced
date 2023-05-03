package core.basesyntax;

public class Square extends Figure implements Drawable, Areable {

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square\nColor: " + getColor() + "\nArea: " + getArea() + "\nSide: " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

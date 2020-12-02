package core.basesyntax;

public class Square extends Shape {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Square, area = " + getArea()
                + " sq. units, side = " + side
                + " units, color = " + getColor());
    }
}

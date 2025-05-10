package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double side) {
        super(color);
        this.sideLength = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, Area: "
                + getArea() + ", SideLength: " + sideLength
                + ", Color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}

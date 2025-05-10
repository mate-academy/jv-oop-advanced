package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("This is a square with area: " + getArea()
                + ". It's side length is: " + side + ". It's color is " + color);
    }
}

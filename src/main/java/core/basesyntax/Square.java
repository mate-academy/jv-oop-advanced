package core.basesyntax;

public class Square extends AbstractFigure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Square - Color: " + getColor() + ", Side: "
                + side + ", Area: " + getArea());
    }
}

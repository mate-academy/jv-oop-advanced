package core.basesyntax;

public class Square extends ColoredFigure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}

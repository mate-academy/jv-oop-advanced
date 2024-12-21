package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String describe() {
        return "Square " + getColor() + " side: " + side + " area: " + getArea();
    }
}

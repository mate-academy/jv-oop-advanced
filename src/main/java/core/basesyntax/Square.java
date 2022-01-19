package core.basesyntax;

public class Square extends Figure implements FigureProperties {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: square. Side: " + side + " mm. Area: " + getArea() + " sq.mm. Color: "
                + color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

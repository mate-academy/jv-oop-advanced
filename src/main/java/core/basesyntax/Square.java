package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String color;

    public Square(int sideA, String color) {
        this.side = sideA;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + color;
    }
}

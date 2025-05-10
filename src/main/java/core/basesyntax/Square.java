package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, side: " + side + " units, color: " + color;
    }
}

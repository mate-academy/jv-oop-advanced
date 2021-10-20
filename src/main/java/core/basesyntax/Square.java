package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private double side;

    public Square(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + getName().toLowerCase() + ", area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor();
    }
}

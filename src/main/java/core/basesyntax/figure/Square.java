package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;

public class Square extends Figure implements AreaCalculator {
    private static final String TYPE_FIGURE = "SQUARE";
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double area = getSide() * getSide();
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + TYPE_FIGURE + ", area: " + String.format("%.2f", area())
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}

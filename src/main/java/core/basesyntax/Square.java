package core.basesyntax;

import core.basesyntax.suppliers.Colors;

public class Square extends Figure {
    private double side;

    public Square(String name, Colors color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getside() {
        return side;
    }

    public void setside(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, " + "side side: "
                + String.format("%.2f", side) + " units, " + "color: " + getColor());
    }
}

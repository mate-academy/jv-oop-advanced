package core.basesyntax.figure;

import core.basesyntax.supplier.FigureType;

public class Square extends Figure {
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
    public double getArea() {
        double area = getSide() * getSide();
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + FigureType.SQUARE + ", area: "
                + String.format("%.2f", getArea()) + " sq.units, side: "
                + getSide() + " units, color: " + getColor());
    }
}

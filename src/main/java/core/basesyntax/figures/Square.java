package core.basesyntax.figures;

import core.basesyntax.utils.Color;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public Square(double area, Color color, double side) {
        super(area, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculate() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, " + "area: " + calculate() + " sq. units, "
                + "side: " + side + " units, color: "
                + getColor().toString().toLowerCase());
    }
}

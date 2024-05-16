package core.basesyntax;

import abstracts.Figure;
import enums.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.getArea()
                + " sq. units, "
                + "side: "
                + this.getSide()
                + " units, color: "
                + this.getColor());
    }
}

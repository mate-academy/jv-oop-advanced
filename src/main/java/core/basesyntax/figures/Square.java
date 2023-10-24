package core.basesyntax.figures;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq.units, side: "
                + getSide() + " units, color: " + getColor());
    }
}

package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Drawable;

public class Square extends Figure implements AreaCalculator, Drawable {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: square, area: "
                + calculateArea() + " sq.units, " + "side: "
                + side + " sq.units, "
                + "color: " + super.getColor();
    }
}


package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.Drawable;

public class RightTriangle extends Rectangle implements Drawable {

    public RightTriangle(Color color, double anySide, double height) {
        super(color, anySide, height);
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    @Override
    public void draw() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: "
                + this.calculateArea() + " sq.units, " + "any side: "
                + super.getAnySide() + " sq.units, " + "height: "
                + super.getHeight() + " sq.units, "
                + "color: " + super.getColor();
    }
}



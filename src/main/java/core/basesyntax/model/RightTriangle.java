package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.FigureDrawing;

public class RightTriangle extends Rectangle implements FigureDrawing {

    public RightTriangle(Color color, double anySide, double height) {
        super(color, anySide, height);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public void drawFigure() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: "
                + area() + " sq.units, " + "any side: "
                + super.getAnySide() + " sq.units, " + "height: "
                + super.getHeight() + " sq.units, "
                + "color: " + super.getColor();
    }
}



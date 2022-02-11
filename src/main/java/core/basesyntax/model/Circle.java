package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.FigureArea;
import core.basesyntax.service.FigureDrawing;

public class Circle extends Figure implements FigureArea, FigureDrawing {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, radius);
    }

    @Override
    public void drawFigure() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + area() + " sq.units, " + "radius: " + radius
                + " sq.units," + " color: " + super.getColor();
    }
}

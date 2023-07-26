package core.basesyntax.figure;

import core.basesyntax.service.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        double square = Math.PI * Math.pow(radius, 2);
        System.out.println("Figure: circle, area: " + Math.round(square)
                + " sq.units, color: "
                + getColor());
    }
}

package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureName;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.setFigureName(FigureName.CIRCLE);
        this.setColor();
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.setFigureName(FigureName.CIRCLE);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return ((int)(Math.PI * radius * radius) * 100) / 100;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + ", "
                + "color: " + this.getColor();
    }
}

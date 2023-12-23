package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.setFigureName(FigureName.CIRCLE);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return ((int)(Math.PI * radius * radius) * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + ", "
                + "color: " + this.getColor());
    }
}

package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;
import core.basesyntax.FigureDraw;

public class Circle extends Figure implements FigureDraw, AreaCalculator {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: "
                + Circle.class.getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor();
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}

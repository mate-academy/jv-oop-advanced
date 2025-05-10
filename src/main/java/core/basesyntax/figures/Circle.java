package core.basesyntax.figures;

import core.basesyntax.state.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, radius: %d cm, color: %s\n",
                getName(), getArea(), radius, getColor());
    }
}

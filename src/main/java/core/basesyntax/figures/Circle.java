package core.basesyntax.figures;

import core.basesyntax.state.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String name) {
        super(name);
        radius = (int)((Math.random() * 10) + 1);
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

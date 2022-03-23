package core.basesyntax.model;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.type = FigureType.CIRCLE;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double result = Math.PI * radius * radius;
        result = Math.round(result * 10.0) / 10.0;
        return result;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameByType()
                + ", area: " + getArea() + " sq.units, side: "
                + radius + ", color: " + getStringColor());
    }
}

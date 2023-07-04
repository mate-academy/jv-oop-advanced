package core.basesyntax.model.figure;

import core.basesyntax.model.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        String area = this.doubleToString(getArea());
        String status = new StringBuilder()
                .append("Figure: circle, area: ")
                .append(area)
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor()).toString();
        System.out.println(status);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

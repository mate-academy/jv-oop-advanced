package core.basesyntax.model.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Drawable;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        String area = Drawable.doubleToString(area());
        String status = new StringBuilder()
                .append("Figure: circle, area: ")
                .append(area)
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(this.color).toString();
        System.out.println(status);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

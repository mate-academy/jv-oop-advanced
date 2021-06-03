package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        super("circle", new ColorSupplier().getRandomColor());
        radius = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(getTitle())
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(this.radius)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(drawBuilder.toString());
    }
}

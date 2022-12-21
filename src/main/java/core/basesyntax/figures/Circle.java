package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double square() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        String square = String.format("%.1f", square());
        builder.append("Figure: square, area: ").append(square).append(" sq.units, ");
        builder.append("radius: ").append(radius);
        builder.append(" units, color: ").append(super.getColor());
        System.out.println(builder);
    }
}

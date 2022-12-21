package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return width * height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        String square = String.format("%.1f", square());
        builder.append("Figure: rectangle, area: ").append(square).append(" sq.units, ");
        builder.append("width: ").append(width).append(" units, ");
        builder.append("height: ").append(height).append(" units, ");
        builder.append("color: ").append(super.getColor());
        System.out.println(builder);
    }
}

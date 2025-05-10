package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        double area = this.calculateArea();
        String colorLowerCase = this.getColor().name().toLowerCase();
        String information = String.format(
                "Figure: circle, area: %.1f sq.units, radius: %d units, color: %s",
                area, radius, colorLowerCase);
        System.out.println(information);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

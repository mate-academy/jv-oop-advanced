package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.print("Figure: circle, area: ");
        System.out.print(getDecimalFormat(area()));
        System.out.print(" sq.units, radius: " + radius + " units, color: " + getColor());
        System.out.println();
    }
}

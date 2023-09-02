package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Circle extends Figure {
    private double radius;


    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.print("Figure: circle, area: ");
        System.out.print(setDecimalFormat(area()));
        System.out.print(" sq.units, radius: " + radius + " units, color: " + getColor());
        System.out.println();
    }
}
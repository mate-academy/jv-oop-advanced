package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        setColor(color);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.print("Figure: rectangle, area: ");
        System.out.print(getDecimalFormat(area()));
        System.out.print(" sq.units, length: " + length + " units, width: "
                + width + " units, color: " + getColor());
        System.out.println();
    }
}

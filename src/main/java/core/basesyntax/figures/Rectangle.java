package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;


    public void setLength(double length) {
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.print("Figure: rectangle, area: ");
        System.out.print(setDecimalFormat(area()));
        System.out.print(" sq.units, length: " + length + " units, width: "
                + width + " units, color: " + getColor());
        System.out.println();
    }
}

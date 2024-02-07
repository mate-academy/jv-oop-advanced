package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private double width;
    private double heigh;

    public Rectangle(Color color, double width, double heigh) {
        super.setColor(color);
        this.width = width;
        this.heigh = heigh;
    }

    @Override
    public double getArea() {
        return width * heigh;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq.units, width: " + width
                + " units, heigh: " + heigh
                + " units, color: " + getColor().name().toLowerCase());
    }
}

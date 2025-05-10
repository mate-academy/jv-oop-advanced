package core.basesyntax.modul;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, String color) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area: " + getArea()
                + ", first side: " + firstSide
                + ", second side: " + secondSide
                + ", height: " + height
                + ", color: " + getColor());
    }
}

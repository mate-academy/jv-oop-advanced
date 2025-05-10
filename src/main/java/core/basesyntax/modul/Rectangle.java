package core.basesyntax.modul;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area: " + getArea()
                + ", first side: " + firstSide
                + ", second side: " + secondSide
                + ", color: " + getColor());
    }
}

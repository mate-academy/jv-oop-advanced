package core.basesyntax;

import core.basesyntax.model.Figure;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure is rectangle: color - " + getColor()
                + ", side1/side2 length - " + sideA + "/" + sideB + ", area - " + getArea());
    }
}

package core.basesyntax;

import core.basesyntax.model.Figure;

public class RightTriangle extends Figure {
    private final double sideA;
    private final double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return 0.5 * (sideA * sideB);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure is rightTriangle: color - " + getColor()
                + ", side1/side2 length - " + sideA + "/" + sideB + ", area - " + getArea());
    }
}

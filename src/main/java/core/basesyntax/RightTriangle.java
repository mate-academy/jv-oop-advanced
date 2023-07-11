package core.basesyntax;

import core.basesyntax.model.Figure;

public class RightTriangle extends Figure {

    private final double side1;
    private final double side2;

    public RightTriangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return 0.5 * (side1 * side2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure is rightTriangle: color - " + getColor()
                + ", side1/side2 length - " + side1 + "/" + side2 + ", area - " + getArea());
    }
}

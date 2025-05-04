package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends FigureImpl {
    private final double height;
    private final double widthA;
    private final double widthB;

    public IsoscelesTrapezoid(Color color, double height, double widthA, double widthB) {
        super(color);
        this.height = height;
        this.widthA = widthA;
        this.widthB = widthB;
    }

    @Override
    public double getArea() {
        return 0.5 * (widthA + widthB) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, widthA: " + widthA + ", widthB: " + widthB
                + ", height: " + height + " units, color: " + getColor());
    }
}

package core.basesyntax.geometry.figures;

import core.basesyntax.geometry.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide,
                              int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (firstSide + secondSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + IsoscelesTrapezoid.class.getSimpleName() + ", area: "
                + calculateArea() + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units, height: " + height
                + " units, color: " + getColor() + "\n");
    }
}

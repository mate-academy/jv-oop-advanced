package core.basesyntax.figure;

import core.basesyntax.colors.Color;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height,
                              Color randomColor) {
        super(randomColor);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "a: " + firstBase + " units"
                + System.lineSeparator()
                + "b: " + secondBase + " units"
                + System.lineSeparator()
                + "height: " + height + " units"
                + System.lineSeparator()
                + "color: " + getColor());
    }
}

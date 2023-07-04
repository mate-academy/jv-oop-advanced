package core.basesyntax.figures;

import core.basesyntax.ColorEnum;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(ColorEnum color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public void draw() {
        System.out.println("Figure: " + "right triangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "first leg: " + firstLeg + " units, "
                + "second leg: " + secondLeg + " units, "
                + "color: " + color.name().toLowerCase()
        );
    }
}

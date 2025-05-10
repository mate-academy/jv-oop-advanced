package core.basesyntax.figures;

import core.basesyntax.ColorEnum;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(ColorEnum color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    public void draw() {
        System.out.println("Figure: " + "rectangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "first side: " + firstSide + " units, "
                + "second side: " + secondSide + " units, "
                + "color: " + color.name().toLowerCase()
        );
    }
}

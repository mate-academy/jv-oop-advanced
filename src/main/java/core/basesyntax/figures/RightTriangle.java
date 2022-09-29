package core.basesyntax.figures;

import java.util.Random;

public class RightTriangle extends Figure {
    private static final String name = "right triangle";
    private int firstLeg;
    private int secondLeg;

    private final Random random = new Random();

    public RightTriangle() {
    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, firstLeg = " + firstLeg
                + " units, secondLeg = " + secondLeg
                + " units, color: " + getColor();
    }
}

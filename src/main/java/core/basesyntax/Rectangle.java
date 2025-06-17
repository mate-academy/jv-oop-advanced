package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private final Random random = new Random();
    private final int firstSide = random.nextInt(10) + 1;
    private final int secondSide = random.nextInt(10) + 1;

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure: Retangle, area: "
                + calculateArea() + " sq. units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + color;
    }
}

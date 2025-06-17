package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    Random random = new Random();
    private final int firstSide = random.nextInt(10) + 1;
    private final int secondSide = random.nextInt(10) + 1;

    public double calculateArea() {
        return firstSide * secondSide;
    }

    public String draw() {
        return "Figure: retangle, area: "
                + calculateArea() + " sq. units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + color;
    }
}

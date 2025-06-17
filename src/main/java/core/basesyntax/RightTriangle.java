package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private final Random random = new Random();
    private final int firstLeg = random.nextInt(10) + 1;
    private final int secondLeg = random.nextInt(10) + 1;

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, area: " + calculateArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + color;
    }
}

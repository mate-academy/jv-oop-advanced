package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private final Random random = new Random();
    private final int radius = random.nextInt(10) + 1;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: Circle, area: " + calculateArea()
                + " sq. units, radius: " + radius + " units, color: " + color;
    }
}

package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private Random random = new Random();
    private final int radius = random.nextInt(10) + 1;

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String draw() {
        return "Figure: circle, area: " + calculateArea()
                + " sq. units, radius: " + radius + " units, color: " + color;
    }
}

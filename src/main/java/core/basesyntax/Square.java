package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private Random random = new Random();
    private final int side = random.nextInt(10) + 1;

    public double calculateArea() {
        return side * side;
    }

    public String draw() {
        return "Figure: square, area: "
                + calculateArea() + " sq. units, side: " + side
                + " units, color: " + color;
    }
}

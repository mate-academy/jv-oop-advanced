package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private final Random random = new Random();
    private final int side = random.nextInt(10) + 1;

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + calculateArea() + " sq. units, side: " + side
                + " units, color: " + color;
    }
}

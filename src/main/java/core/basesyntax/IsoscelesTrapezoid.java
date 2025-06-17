package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    Random random = new Random();
    private final int base1 = random.nextInt(10) + 1;
    private final int base2 = random.nextInt(10) + 1;
    private final int height = random.nextInt(10) + 1;

    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    public String draw() {
        return "Figure: IsoscelesTrapezoid, area: "
                + calculateArea() + " sq. units, base1: "
                + base1 + " units, base2: " + base2 + " units, height: "
                + height + " units, color: " + color;
    }
}

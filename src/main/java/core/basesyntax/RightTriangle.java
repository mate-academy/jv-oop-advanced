package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RightTriangle extends Figure implements Interface{
    private final double firstLeg;
    private final double secondLeg;
    private final String name = "right triangle";
    private final String color;
    BigDecimal bd;

    RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public double getArea() {
        bd = BigDecimal.valueOf(firstLeg * secondLeg / 2);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}

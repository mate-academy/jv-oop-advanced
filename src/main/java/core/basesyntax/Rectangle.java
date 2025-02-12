package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Figure implements Interface {
    private final double bigSide;
    private final double smallSide;
    private final String name = "rectangle";
    private final String color;
    BigDecimal bd;

    Rectangle(double bigSide, double smallSide, String color) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
        this.color = color;
    }

    public double getArea() {
        bd = BigDecimal.valueOf(bigSide * smallSide);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, big side: " + bigSide
                + " units, small side: " + smallSide + " units, color: " + color);
    }
}

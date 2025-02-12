package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IsoscelesTrapezoid extends Figure implements Interface {
    private final double smallBase;
    private final double bigBase;
    private final double height;
    private String name = "isosceles trapezoid";
    private final String color;
    BigDecimal bd;

    IsoscelesTrapezoid(double smallBase, double bigBase, double height, String color) {
        this.smallBase = smallBase;
        this.bigBase = bigBase;
        this.height = height;
        this.color = color;
    }

    public double getArea() {
        bd = BigDecimal.valueOf((smallBase + bigBase) * height / 2);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, small base: "
                + smallBase + " units, big base: " + bigBase + " units, height: " + height +
                " units, color: " + color);
    }
}

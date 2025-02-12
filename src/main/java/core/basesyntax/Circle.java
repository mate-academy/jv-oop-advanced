package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure implements Interface {
    private final double radius;
    private final String name = "circle";
    private final String color;
    private BigDecimal bd;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        bd = BigDecimal.valueOf(Math.PI * radius * radius);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, radius: "
                + radius
                + " units, color: " + color);
    }
}

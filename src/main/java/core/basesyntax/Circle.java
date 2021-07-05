package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        BigDecimal bd = BigDecimal.valueOf(Math.PI * radius);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

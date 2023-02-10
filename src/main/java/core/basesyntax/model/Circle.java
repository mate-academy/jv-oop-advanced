package core.basesyntax.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        MathContext context = new MathContext(5, RoundingMode.HALF_UP);
        return new BigDecimal(Math.pow(radius, 2) * Math.PI, context).doubleValue();
    }
}

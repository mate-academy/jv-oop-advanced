package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid() {
        super();
        Random random = new Random();
        this.base1 = Math.round(random.nextDouble(100) * 10.0) / 10.0;
        this.base2 = Math.round(random.nextDouble(100) * 10.0) / 10.0;
        this.height = Math.round(random.nextDouble(100) * 10.0) / 10.0;
    }

    public IsoscelesTrapezoid(double base1, double base2, double height) {
        super();
        this.base1 = Math.round(base1 * 10.0) / 10.0;
        this.base2 = Math.round(base2 * 10.0) / 10.0;
        this.height = Math.round(height * 10.0) / 10.0;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1
                + " units, base2: " + base2
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}

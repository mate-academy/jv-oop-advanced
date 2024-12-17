package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int leg;
    private double height;

    public IsoscelesTrapezoid() {
        super();
        this.baseA = new Random().nextInt(100);
        this.baseB = new Random().nextInt(100);
        this.leg = new Random().nextInt(100);
        this.height = Math.sqrt(Math.pow(leg,2) - Math.pow((baseA - baseB),2));
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + String.format("%.2f", this.getArea()) + " sq. units, "
                + "leg: " + this.leg + " units, "
                + "base A: " + this.baseA + " units, "
                + "base B: " + this.baseB + " units, "
                + "height: " + this.height + " units, "
                + "color: " + this.getColor());
    }

    public double getArea() {
        return ((baseA + baseB) * height) / 2;
    }
}

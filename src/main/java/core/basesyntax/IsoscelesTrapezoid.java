package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int side;

    public IsoscelesTrapezoid() {
        this.side = new Random().nextInt(15);
        this.upperBase = new Random().nextInt(15);
        this.lowerBase = new Random().nextInt(15);
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) * Math.sqrt((side * side)
                - ((lowerBase - upperBase) * (lowerBase - upperBase)) / 4);
    }

    @Override
    public void draw() {
        System.out.println(("Figure: Isosceles Trapezoid, upper base: "
                + upperBase + ", lower base: " + lowerBase + ", side "
                + side + ", area: " + getArea() + ", color: " + getColor()));
    }
}

package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int side;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int lowerBase, int upperBase, int side, String color) {
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int lowerBase = new Random().nextInt(15);
        int upperBase = new Random().nextInt(15);
        int side = new Random().nextInt(15);
        String color = getColor();
        return new IsoscelesTrapezoid(lowerBase, upperBase, side, color);
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

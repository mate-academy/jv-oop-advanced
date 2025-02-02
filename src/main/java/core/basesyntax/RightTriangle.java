package core.basesyntax;

import java.util.Random;

public class RightTriangle extends ColorSupplier {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        this.firstLeg = new Random().nextInt(100);
        this.secondLeg = new Random().nextInt(100);
        {
            draw();
        }
    }

    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea()
                + " sq. units, first leg: "
                + firstLeg
                + " units, "
                + " sq. units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getRandomColor());
    }

    public double getArea() {
        return firstLeg * secondLeg;
    }
}

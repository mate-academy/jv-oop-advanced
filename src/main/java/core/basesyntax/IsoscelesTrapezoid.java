package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends ColorSupplier {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid() {
        this.base1 = new Random().nextInt(100);
        this.base2 = new Random().nextInt(100);
        this.height = new Random().nextInt(100);
        {
            draw();
        }
    }

    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea()
                + " sq. units, base1: "
                + base1
                + " units, "
                + " sq. units, base2: "
                + base2
                + "units, "
                + " height: "
                + height
                + " units, color: "
                + getRandomColor());
    }

    public double getArea() {
        return (base1 + base2) * height / 2;
    }
}

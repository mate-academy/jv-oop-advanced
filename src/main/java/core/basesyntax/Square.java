package core.basesyntax;

import java.util.Random;

public class Square extends ColorSupplier {
    private int side;

    public Square() {
        this.side = new Random().nextInt(100);
        {
            draw();
        }
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea()
                + " sq. units, side : "
                + side
                + " units, color: "
                + getRandomColor());
    }
}

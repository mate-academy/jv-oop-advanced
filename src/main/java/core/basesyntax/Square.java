package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private final int sideLength;

    public Square(String name, Color color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        DecimalFormat formatter = new DecimalFormat("0.#");
        System.out.println("Figure: " + getName()
                + ", area: " + formatter.format(getArea())
                + " sq. units, side length: " + sideLength
                + " units, color: " + getColor());
    }

    @Override
    double getArea() {
        return sideLength * sideLength;
    }
}

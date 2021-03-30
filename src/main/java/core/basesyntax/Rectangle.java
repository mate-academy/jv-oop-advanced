package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private final int height;
    private final int length;

    public Rectangle(String name, Color color, int height, int length) {
        super(name, color);
        this.height = height;
        this.length = length;
    }

    @Override
    public void draw() {
        DecimalFormat formatter = new DecimalFormat("0.#");
        System.out.println("Figure: " + getName()
                + ", area: " + formatter.format(getArea())
                + " sq. units, height: " + height
                + " units, length: " + length
                + " units, color: " + getColor());
    }

    @Override
    double getArea() {
        return height * length;
    }
}

package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: rectangle, area: "
                + decimalFormat.format(getArea())
                + " sq.units, length: "
                + (int) length
                + " units, width: "
                + (int) width
                + " units, color: "
                + getColor());
    }
}

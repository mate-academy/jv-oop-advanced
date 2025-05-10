package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        String formattedArea = decimalFormat.format(getArea());
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", Area: "
                + formattedArea + " sq.units, length: "
                + length + " Units, width: "
                + width + " Units, Color: " + super.getColor());
    }
}

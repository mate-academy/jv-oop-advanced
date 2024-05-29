package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private static final String OUTPUT_RECTANGLE = "Figure: rectangle, "
            + "area: %.2f sq. units, "
            + "width: %.2f units, "
            + "length: %.2f units, "
            + "color: %s";
    private double width;
    private double length;

    public Rectangle() {

    }

    public Rectangle(Color color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        this.area = width * length;
        return area;
    }

    @Override
    public void draw() {
        System.out.println(String.format(OUTPUT_RECTANGLE,
                this.area,
                this.width,
                this.length,
                this.color
        ));
    }
}

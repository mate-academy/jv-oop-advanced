package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        double area = this.calculateArea();
        String colorLowerCase = this.getColor().name().toLowerCase();
        String information = String.format(
                "Figure: rectangle, area: %.1f sq.units, "
                        + "length: %d units, width: %d units, color: %s",
                area, length, width, colorLowerCase);
        System.out.println(information);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

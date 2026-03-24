package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + String.format("%.1f",getArea())
                        + " sq. units, height: " + String.format("%.1f",height)
                        + " units, width: " + String.format("%.1f",width)
                        + " units, color: " + getColor()
        );
    }
}
package core.basesyntax.figures;

import core.basesyntax.enums.FigureName;

public class Rectangle extends AbstractFigure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width + width + height + height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.RECTANGLE.name().toLowerCase()
                + ", area: " + getSquare()
                + ", perimeter: " + getPerimeter()
                + ", height" + height
                + ", width" + width
                + ", color: " + super.getColor().toLowerCase());
    }
}

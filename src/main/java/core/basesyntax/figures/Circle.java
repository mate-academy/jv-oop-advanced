package core.basesyntax.figures;

import core.basesyntax.enums.FigureName;

public class Circle extends AbstractFigure {
    private static final int FORMULA_NUMBER = 2;
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return FORMULA_NUMBER * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.CIRCLE.name().toLowerCase()
                + ", area: " + getSquare()
                + ", perimeter: " + getPerimeter()
                + ", radius: " + radius
                + ", color: " + super.getColor().toLowerCase());
    }
}

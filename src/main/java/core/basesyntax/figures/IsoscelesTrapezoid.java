package core.basesyntax.figures;

import core.basesyntax.enums.FigureName;

public class IsoscelesTrapezoid extends AbstractFigure {
    private static final int NUMBER_OF_SIDE = 2;
    private final double firstBaseSide;
    private final double secondBaseSide;
    private final double height;
    private final double side;

    public IsoscelesTrapezoid(String color, double firstBaseSide, double secondBaseSide,
                              double height, double side) {
        super(color);
        this.firstBaseSide = firstBaseSide;
        this.secondBaseSide = secondBaseSide;
        this.height = height;
        this.side = side;
    }

    @Override
    public double getSquare() {
        return (firstBaseSide + secondBaseSide) / 2 * height;
    }

    @Override
    public double getPerimeter() {
        return NUMBER_OF_SIDE * side + firstBaseSide + secondBaseSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.ISOSCELES_TRAPEZOID.name().toLowerCase()
                + ", area: " + getSquare()
                + ", perimeter: " + getPerimeter()
                + ", firstBaseSide: " + firstBaseSide
                + ", secondBaseSide: " + secondBaseSide
                + ", height: " + height
                + ", side: " + side
                + ", color: " + super.getColor().toLowerCase());
    }
}

package core.basesyntax.figures;

import core.basesyntax.enums.FigureName;

public class RightTriangle extends AbstractFigure {
    private static final int FORMULA_NUMBER = 2;
    private final double firstLeg;
    private final double secondLeg;
    private final double hypotenuse;

    public RightTriangle(String color, double firstLeg, double secondLeg, double hypotenuse) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getSquare() {
        return firstLeg * secondLeg / FORMULA_NUMBER;
    }

    @Override
    public double getPerimeter() {
        return firstLeg + secondLeg + hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.RIGHT_TRIANGLE.name().toLowerCase()
                + ", area: " + getSquare()
                + ", perimeter: " + getPerimeter()
                + ", firstLeg: " + firstLeg
                + ", secondLeg" + secondLeg
                + ", hypotenuse" + hypotenuse
                + ", color: " + super.getColor().toLowerCase());
    }
}

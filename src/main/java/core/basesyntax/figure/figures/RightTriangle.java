package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

public class RightTriangle extends Figure {

    public static final Shape NAME = Shape.RIGHT_TRIANGLE;
    private double base;
    private double height;

    public RightTriangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return base * height / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getColor() + " " + NAME + " with base "
                + getBase() + ", height " + getHeight() + ", and square " + getSquare();
    }
}

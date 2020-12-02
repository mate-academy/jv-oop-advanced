package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

public class IsoscelesTrapezoid extends Figure {

    public static final Shape NAME = Shape.ISOSCELES_TRAPEZOID;
    private double upperSide;
    private double lowerSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double upperSide, double lowerSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return (getLowerSide() + getUpperSide()) * height / 2;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(double lowerSide) {
        this.lowerSide = lowerSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getColor() + " " + NAME + " with height, "
                + getHeight() + " lower side " + getLowerSide()
                + ", upper side " + getUpperSide() + ", and square " + getSquare();
    }
}

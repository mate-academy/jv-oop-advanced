package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

public class IsoscelesTrapezoid extends Figure {

    public static final Shape NAME = Shape.ISOSCELES_TRAPEZOID;
    private int upperSide;
    private int lowerSide;
    private int height;

    public IsoscelesTrapezoid(Color color, int upperSide, int lowerSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return (getLowerSide() + getUpperSide()) * height / 2;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getColor() + " " + NAME + " with height, "
                + getHeight() + " units, lower side " + getLowerSide() + " units, upper side "
                + getUpperSide() + " units, and square " + getSquare() + " sq. units.";
    }
}

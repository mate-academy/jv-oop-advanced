package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class IsoscelesTrapezoid extends Figure {

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
    public void draw() {
        System.out.println("   ####  ");
        System.out.println("  #    # ");
        System.out.println(" #      # ");
        System.out.println("##########");
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
        return getColor() + " " + getClass().getSimpleName() + " with height, "
                + getHeight() + " units, lower side " + getLowerSide() + " units, upper side "
                + getUpperSide() + " units, and square " + getSquare() + " sq. units.";
    }
}

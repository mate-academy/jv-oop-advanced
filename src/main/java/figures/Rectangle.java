package figures;

import randomiser.Color;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstSide = firstLeg;
        this.secondSide = secondLeg;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * (firstSide + secondSide);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rectangle, area: %.2f sq.units, first side %.2f units, "
                + "second side %.2f units, color: %s",
                getSquare(), getFirstSide(), getSecondSide(), getColor());
    }
}

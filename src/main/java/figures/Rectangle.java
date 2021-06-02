package figures;

import randomiser.Color;

public class Rectangle implements Figure {

    private Color color;
    private double firstSide;
    private double secondSide;

    public Rectangle() {
    }

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstSide = firstLeg;
        this.secondSide = secondLeg;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

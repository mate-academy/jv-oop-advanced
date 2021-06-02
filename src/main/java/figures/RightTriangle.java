package figures;

import randomiser.Color;

public class RightTriangle implements Figure {

    private Color color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getSquare() {
        return (firstLeg + secondLeg) / 2;
    }

    @Override
    public double getPerimeter() {
        return firstLeg + secondLeg + getHypotenuse();
    }

    private double getHypotenuse() {
        return Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(firstLeg, 2));
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: right triangle, area: %.2f sq.units, first side %.2f units, "
                + "second side %.2f units, hypotenuse %.2f units, color: %s",
                getSquare(), getFirstLeg(), getSecondLeg(), getHypotenuse(), getColor());
    }
}

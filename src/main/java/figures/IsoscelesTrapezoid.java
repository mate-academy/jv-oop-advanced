package figures;

import randomiser.Color;

public class IsoscelesTrapezoid extends Rectangle {

    private double height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(Color color, double firstSide, double secondSide, double height) {
        super(color, firstSide, secondSide);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double cornerA() {
        return height / ((getFirstSide() - getSecondSide()) / 2);
    }

    @Override
    public double getSquare() {
        return (getFirstSide() + getSecondSide()) * height / 2;
    }

    @Override
    public double getPerimeter() {
        return getFirstSide() + getSecondSide() + height / cornerA();
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: isosceles trapezoid, area: %.2f sq.units, first side %.2f units, "
                + "second side %.2f units, "
                + "height %.2f units, color: %s",
                getSquare(), getFirstSide(), getSecondSide(), getHeight(), getColor());
    }
}

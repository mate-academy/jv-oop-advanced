package core.basesyntax.figures;

import static core.basesyntax.utils.NumberRounder.round;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        super("isosceles trapezoid", color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + ", 1st base: " + round(firstBase) + " units"
                + ", 2nd base: " + round(secondBase) + " units"
                + ", height: " + round(height) + " units";
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height * 0.5;
    }
}

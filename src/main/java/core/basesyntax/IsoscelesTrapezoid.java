package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private double firstBase;
    private double secondBase;

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
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

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "first base: " + firstBase + " units, "
                + "second base: " + secondBase + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }
}

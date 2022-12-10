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
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, "
                + "area: " + this.getArea() + " sq.units, "
                + "first base: " + this.getFirstBase() + " units, "
                + "second base: " + this.getSecondBase() + " units, "
                + "height: " + this.getHeight() + " units, "
                + "color: " + this.getColor();
    }
}

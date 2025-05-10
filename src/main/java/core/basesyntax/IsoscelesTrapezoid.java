package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, firstBase: "
                + firstBase + " units, secondBase: " + secondBase + " units, height: "
                + height + " units, color: " + getColor());
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public int getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first base: " + getFirstBase()
                + " units, second base: " + getSecondBase()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}

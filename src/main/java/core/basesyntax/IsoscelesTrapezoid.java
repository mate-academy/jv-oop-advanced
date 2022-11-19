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

    public String drawFigure(IsoscelesTrapezoid isoscelesTrapezoid) {
        return "Figure: " + isoscelesTrapezoid.getName() + ", area: " + isoscelesTrapezoid.getArea()
                + " sq.units, first base: " + isoscelesTrapezoid.getFirstBase()
                + " units, second base: " + isoscelesTrapezoid.getSecondBase()
                + " units, height: " + isoscelesTrapezoid.getHeight()
                + " units, color: " + isoscelesTrapezoid.getColor();
    }
}

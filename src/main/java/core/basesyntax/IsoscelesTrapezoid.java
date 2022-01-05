package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first base: " + firstBase + " units, second base: " + secondBase
                + " units, height: " + height + " sq.units, color: " + getColor());

    }
}

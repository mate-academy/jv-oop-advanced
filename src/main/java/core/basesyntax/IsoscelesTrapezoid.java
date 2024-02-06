package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int high;

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        return (double) ((firstBase + secondBase) * high / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.units, firstBase: " + firstBase + " units, secondBase: "
                + secondBase + " units, high: " + high + " units, color: " + getColor());
    }
}

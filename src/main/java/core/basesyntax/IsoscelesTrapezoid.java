package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: trapezoid,"
                        + " area: %.1f sq. units,"
                        + " height: %.1f sq. units,"
                        + " firstBase: %.1f sq. units,"
                        + " secondBase: %.1f sq. units,"
                        + " color: %s\n",
                calculateArea(), height, firstBase, secondBase, getColor());
    }
}

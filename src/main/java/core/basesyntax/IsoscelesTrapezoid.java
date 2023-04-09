package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double heigth;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getHeigth() {
        return heigth;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * heigth / 2;
    }
}
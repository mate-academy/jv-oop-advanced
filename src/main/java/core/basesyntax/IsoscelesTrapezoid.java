package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLength;
    private int secondLength;
    private int heightOfTrapezoid;

    public IsoscelesTrapezoid(int firstLength,
                              int secondLength,
                              int heightOfTrapezoid,
                              Color color) {
        super(color);
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.heightOfTrapezoid = heightOfTrapezoid;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid: "
                + "firstLength = " + firstLength
                + ", secondLength = " + secondLength
                + ", heightOfTrapezoid = " + heightOfTrapezoid
                + ',' + super.toString();
    }

    @Override
    public double areaCalculator() {
        return (double)(firstLength + secondLength) * heightOfTrapezoid / 2;
    }
}

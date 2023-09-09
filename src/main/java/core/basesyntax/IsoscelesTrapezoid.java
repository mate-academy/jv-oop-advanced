package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, InformationDrawer {
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(Colors color, int sideA, int sideB, int height) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public int areaCalculator() {
        return (this.sideA + this.sideB) / 2 * this.height;
    }

    @Override
    public void informationCalculator() {
        String trapezoidInformation = "Figure: isoscelesTrapezoid, area: " + areaCalculator() + "sq.units, sideA: " + this.sideA + "units, sideB: " + this.sideB + " units, height: " + this.height + " units, color: " + color;
        System.out.println(trapezoidInformation);
    }
}

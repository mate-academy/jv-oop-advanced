package core.basesyntax;

public class RightTriangle extends Figure implements Area {
    private int firstLeg;
    private int secondLeg;
    private int hypotenuse;

    @Override
    public double areaCalculator() {
        return firstLeg * secondLeg * 0.5;
    }
}

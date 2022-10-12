package core.basesyntax.figures;

import core.basesyntax.AreaCalculation;
import core.basesyntax.Figure;

public class RightTriangle extends Figure implements AreaCalculation {

    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, String name, int firstLeg, int secondLeg) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                + " firstLeg: "
                + firstLeg
                + " units"
                + " secondLeg: "
                + secondLeg
                + " units";
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}

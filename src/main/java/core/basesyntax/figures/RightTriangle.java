package core.basesyntax.figures;

import core.basesyntax.services.AreaCalculator;
import core.basesyntax.services.ColorSupplier;

public class RightTriangle extends Figure implements AreaCalculator {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(draw());
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, color: "
                + getColor());

    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return new ColorSupplier().getRandomColor();
    }
}

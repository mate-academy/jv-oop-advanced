package core.basesyntax.figure;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(FigureType.TRIANGLE, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, "
                        + "area: %.1f sq. units, "
                        + "firstLeg: %d units, secondLeg: %d units, "
                        + "color: %s",
                getType().name().toLowerCase(),
                getArea(),
                firstLeg, secondLeg,
                getColor().name().toLowerCase()
        ));
    }
}

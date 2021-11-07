package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure{
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.figureType = FigureType.RIGHT_TRIANGLE.toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstLeg: %d units, secondLeg: %d units, color: %s%n",
                figureType,
                getArea(),
                firstLeg,
                secondLeg,
                color);
    }
}

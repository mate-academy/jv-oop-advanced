package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;
import core.basesyntax.FigureDraw;

public class RightTriangle extends Figure implements FigureDraw, AreaCalculator {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: "
                + RightTriangle.class.getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}

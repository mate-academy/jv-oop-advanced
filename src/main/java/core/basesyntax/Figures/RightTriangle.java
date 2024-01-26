package core.basesyntax.Figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Color {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Type: circle, color: "
                + getColor()
                + ", area: "
                + getArea()
                + ", first leg: "
                + firstLeg
                + ", second leg: "
                + secondLeg);
    }
}

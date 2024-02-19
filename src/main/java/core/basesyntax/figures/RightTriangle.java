package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Color;
import core.basesyntax.Drawable;

public class RightTriangle extends Figure implements AreaCalculator, Drawable {
    private double firstLeg;
    private double secondLeg;
    private Color color;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (0.5 * firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle; area: " + calculateArea()
                + " sq. units; first leg: " + firstLeg + " units; second leg: "
                + secondLeg + " units; color: " + color);
    }
}

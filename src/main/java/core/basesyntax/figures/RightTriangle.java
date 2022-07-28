package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void printArea() {
        System.out.println(0.5 * firstLeg * secondLeg);
    }

    @Override
    public Figure getRandomParameters() {
        Random random = new Random();
        int max = Figure.MAX_VALUE_OF_PARAM;
        Color triangleColor = new ColorSupplier().getRandomColor();
        return new RightTriangle(triangleColor, random.nextInt(max), random.nextInt(max));
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor();
    }
}

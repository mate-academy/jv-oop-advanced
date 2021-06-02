package core.basesyntax;

import java.util.Random;

public class Square extends FigureDraw implements AreaCalculator {

    private Double firstLeg;
    private Double secondLeg;

    Square() {
        firstLeg = new Random().nextInt(10) * 1.00 + 1.00;
        secondLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, sides: firstLeg "
                + firstLeg + " units, secondLeg " + secondLeg + " units, color: "
                + ColorSupplier.getRandomColor());
    }
}

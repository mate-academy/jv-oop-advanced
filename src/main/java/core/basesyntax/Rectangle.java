package core.basesyntax;

import java.util.Random;

public class Rectangle extends FigureDraw implements AreaCalculator {

    private Double firstLeg;
    private Double secondLeg;

    Rectangle() {
        firstLeg = new Random().nextInt(10) * 1.00 + 1.00;
        secondLeg = new Random().nextInt(10) * 1.00 + 1.00;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, sides: firstLeg "
                + firstLeg + " units, secondLeg " + secondLeg + " units, color: "
                + ColorSupplier.getRandomColor());
    }
}

package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends FigureDraw implements AreaCalculator {

    private Double firstLeg;
    private Double secondLeg;
    private Double heigh;

    IsoscelesTrapezoid() {
        firstLeg = new Random().nextInt(10) * 1.00 + 1.00;
        secondLeg = new Random().nextInt(10) * 1.00 + 1.00;
        heigh = new Random().nextInt(10) * 1.00 + 1.00;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) * heigh / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq.units, sides: firstLeg "
                + firstLeg + " units, secondLeg " + secondLeg + " units, heigh " + heigh
                + " units, color: " + ColorSupplier.getRandomColor());
    }
}


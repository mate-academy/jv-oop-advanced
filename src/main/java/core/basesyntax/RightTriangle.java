package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle() {
        Random random = new Random();
        this.firstLeg = random.nextInt(1, 10);
        this.secondLeg = random.nextInt(1, 10);
        this.color = new ColorSupplier().getRandomColor();
    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq. units, sideA: " + this.firstLeg
                + " units, sideB: " + this.secondLeg
                + " units, color: " + this.color);
    }
}

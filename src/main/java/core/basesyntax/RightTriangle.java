package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private String rightTriangleColor = new Figure().getColor();

    public RightTriangle(Random random) {
        this.firstLeg = Math.abs(random.nextInt());
        this.secondLeg = Math.abs(random.nextInt());
        this.rightTriangleColor = ColorSupplier.getRandomColor();
        draw();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + rightTriangleColor);
    }
}

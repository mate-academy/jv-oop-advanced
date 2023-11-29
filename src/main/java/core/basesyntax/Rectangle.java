package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    private String rectangleColor = new Figure().getColor();

    public Rectangle(Random random) {
        this.sideA = Math.abs(random.nextInt());
        this.sideB = Math.abs(random.nextInt());
        this.rectangleColor = ColorSupplier.getRandomColor();
        draw();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, sideA: " + sideA
                + " sq. units, sideB: " + sideB + " units, color: " + rectangleColor);
    }
}

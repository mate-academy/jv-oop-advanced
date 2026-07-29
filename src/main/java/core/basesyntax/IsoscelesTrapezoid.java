package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int height;

    public IsoscelesTrapezoid() {
        Random random = new Random();
        this.bottomSide = random.nextInt(1, 10);
        this.topSide = random.nextInt(1, 10);
        this.height = random.nextInt(1, 10);
        this.color = new ColorSupplier().getRandomColor();
    }

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) (topSide + bottomSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq. units, topSide: " + this.topSide
                + " units, bottomSide: " + this.bottomSide
                + " units, height: " + this.height
                + " units, color: " + this.color);
    }
}

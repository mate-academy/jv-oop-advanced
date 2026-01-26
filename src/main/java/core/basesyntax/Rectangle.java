package core.basesyntax;

import java.util.Random;

public class Rectangle extends AbstractFigure {
    private Random random;
    private double width;
    private double height;

    public Rectangle() {
        this.random = new Random();
        this.width = random.nextDouble(100, 1000);
        this.height = random.nextDouble(100, 1000);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: units, area: "
                + getArea()
                + " sq. units, width: "
                + width
                + " sq. units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}

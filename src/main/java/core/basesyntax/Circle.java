package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    public static final int MAXIMUM_SIZE = 50;
    private int radius;
    private Random random = new Random();

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void randomizeProperty() {
        radius = random.nextInt(MAXIMUM_SIZE);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle, " + "area: " + this.getArea() + " sq. units, radius: "
                            + this.radius + " units, color: " + super.getColor());
    }
}

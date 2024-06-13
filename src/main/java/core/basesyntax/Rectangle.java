package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    public static final int MAXIMUM_SIZE = 50;
    private int length;
    private int width;
    private Random random = new Random();

    @Override
    public void randomizeProperty() {
        length = random.nextInt(MAXIMUM_SIZE);
        width = random.nextInt(MAXIMUM_SIZE);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, " + "area: " + this.getArea()
                            + " sq. units, length: " + this.length + " units, width: "
                            + width + " units, color: " + super.getColor());
    }
}

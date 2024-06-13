package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    public static final int MAXIMUM_SIZE = 50;
    private int bottom;
    private int top;
    private int height;
    private Random random = new Random();

    @Override
    public void randomizeProperty() {
        bottom = random.nextInt(MAXIMUM_SIZE);
        top = random.nextInt(MAXIMUM_SIZE);
        height = random.nextInt(MAXIMUM_SIZE);
    }

    @Override
    public double getArea() {
        return 0.5 * (bottom + top) * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Isosceles Trapezoid, " + "area: " + this.getArea()
                           + " sq. units, bottom: " + this.bottom + " units, top: " + this.top
                           + "units, height: " + this.height + " units, color: "
                           + super.getColor());
    }
}


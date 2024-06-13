package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    public static final int MAXIMUM_SIZE = 50;
    private int side;
    private Random random = new Random();

    @Override
    public void randomizeProperty() {
        side = random.nextInt(MAXIMUM_SIZE);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, " + "area: " + this.getArea()
                            + " sq. units, side: " + this.side
                            + " units, color: " + super.getColor());
    }
}

package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    public static final int MAXIMUM_SIZE = 50;
    private int firstLeg;
    private int secondLeg;
    private Random random = new Random();

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void randomizeProperty() {
        firstLeg = random.nextInt(MAXIMUM_SIZE);
        secondLeg = random.nextInt(MAXIMUM_SIZE);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: RightTriangle, " + "area: " + this.getArea()
                            + " sq. units, first leg: " + this.firstLeg + " units, second leg: "
                            + this.secondLeg + ", color: " + super.getColor());
    }
}

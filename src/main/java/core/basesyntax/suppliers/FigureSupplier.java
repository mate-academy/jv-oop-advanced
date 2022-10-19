package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private static final double CIRCLE_RADIUS = 10;
    private static final String CIRCLE_WHITE = String.valueOf(Color.WHITE);

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(4);
        switch (indexOfFigure) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(), getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        getRandomDouble(), getRandomDouble());
            case 4:
            default:
                return new Square(new ColorSupplier().getRandomColor(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return random.nextInt(100);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_WHITE, CIRCLE_RADIUS);
    }
}

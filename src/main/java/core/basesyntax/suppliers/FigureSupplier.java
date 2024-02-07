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
    private final String circleWhite = String.valueOf(Color.WHITE);

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(4);
        switch (indexOfFigure) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            case 4:
            default:
                return getSquare();
        }
    }

    private Square getSquare() {
        return new Square(new ColorSupplier().getRandomColor(), getRandomInt());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(new ColorSupplier().getRandomColor(),
                getRandomDouble(), getRandomDouble());
    }

    private Circle getCircle() {
        return new Circle(new ColorSupplier().getRandomColor(), getRandomDouble());
    }

    private Rectangle getRectangle() {
        return new Rectangle(new ColorSupplier().getRandomColor(),
                getRandomInt(), getRandomInt());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    private int getRandomInt() {
        return random.nextInt(100);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    public Figure getDefaultFigure() {
        double circleRadius = 10;
        return new Circle(circleWhite, circleRadius);
    }
}

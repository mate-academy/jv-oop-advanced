package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final double CIRCLE_RADIUS = 10.0;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random randomIndex = new Random();

    public Figure getRandomFigure() {
        switch (randomIndex.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRightTriangle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public double getRandomDouble() {
        return (new Random().nextInt(1000) + 100) / 100.0;
    }

    private Circle getRandomCircle() {
        return new Circle(randomColor.getRandomColor(),
                getRandomDouble());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(randomColor.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Square getRandomSquare() {
        return new Square(randomColor.getRandomColor(),
                getRandomDouble());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_RADIUS);
    }
}

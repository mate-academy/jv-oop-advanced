package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURES = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final String WHITE_COLOR = String.valueOf(Color.WHITE);
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(COUNT_OF_FIGURES);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR, CIRCLE_RADIUS);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                getRandomDouble());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                getRandomDouble());
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomDouble());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                getRandomDouble(), getRandomDouble());
    }

}

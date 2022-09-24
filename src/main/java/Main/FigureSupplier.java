package Main;

import core.basesyntax.*;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_INT = 25;
    private static final String CIRCLE_COLOR = Colors.WHITE.toString().toLowerCase();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURES_NUMBER = 5;

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10,CIRCLE_COLOR);
        return circle;
    }

    public Circle getRandomCircle() {
        return new Circle(random.nextInt(30),
                colorSupplier.getRandomColor());
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(30));
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(20),
                random.nextInt(20));
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(25),
                random.nextInt(25));
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(20),
                random.nextInt(20),
                random.nextInt(20));
    }

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(FIGURES_NUMBER);
        switch (indexOfFigure) {
            case 0:
                return getRandomIsoscelesTrapezoid();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomRectangle();
        }
    }
}


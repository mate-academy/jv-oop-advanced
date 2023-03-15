package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int CIRCLE_RADIUS = 10;
    public static final int MAX_OF_BOUND = 40;
    public static final int FIGURES_NUMBER = 5;
    public static final String COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURES_NUMBER);
        switch (randomNumber) {
            case 0:
                return createCircle();
            case 1:
                return createIsoscelesTrapezoid();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return createSquare();
        }
    }

    private Figure createSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_OF_BOUND));
    }

    private Figure createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND));
    }

    private Figure createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND));
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND),
                random.nextInt(MAX_OF_BOUND));
    }

    private Figure createCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_OF_BOUND));
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, CIRCLE_RADIUS);
    }
}

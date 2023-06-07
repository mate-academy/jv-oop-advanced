package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH = 10;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        Figures figureType = Figures.values()[index];

        if (figureType == Figures.SQUARE) {
            return createNewSquare();
        }
        if (figureType == Figures.RECTANGLE) {
            return createNewRectangle();
        }
        if (figureType == Figures.RIGHT_TRIANGLE) {
            return createNewRightTriangle();
        }
        if (figureType == Figures.CIRCLE) {
            return createNewCircle();
        }
        if (figureType == Figures.ISOSCELES_TRAPEZOID) {
            return createNewIsoscelesTrapezoid();
        } else {
            return null;

        }
    }

    public Figure createNewSquare() {
        return new Square(randomColor.getRandomColor(),
                random.nextDouble() + random.nextInt(MAX_LENGTH));
    }

    public Figure createNewRectangle() {
        return new Rectangle(randomColor.getRandomColor(),
                random.nextDouble() + random.nextInt(MAX_LENGTH),
                random.nextDouble() + random.nextInt(MAX_LENGTH));
    }

    public Figure createNewRightTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                random.nextDouble() + random.nextInt(MAX_LENGTH),
                random.nextDouble() + random.nextInt(MAX_LENGTH));
    }

    public Figure createNewIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                random.nextDouble() + random.nextInt(MAX_LENGTH),
                random.nextDouble() + random.nextInt(MAX_LENGTH),
                random.nextDouble() + random.nextInt(MAX_LENGTH));
    }

    public Figure createNewCircle() {
        return new Circle(randomColor.getRandomColor(), random.nextDouble());
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

}

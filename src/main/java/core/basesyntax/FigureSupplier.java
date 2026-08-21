package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIZE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(Figures.values().length);
        Figures randomFigure = Figures.values()[randomIndex];

        return switch (randomFigure) {
            case ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid();
            case CIRCLE -> getRandomCircle();
            case SQUARE -> getRandomSquare();
            case RECTANGLE -> getRandomRectangle();
            case RIGHT_TRIANGLE -> getRandomRightTriangle();
        };
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSize());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSize());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                getRandomSize(), getRandomSize());
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE + 1);
    }
}

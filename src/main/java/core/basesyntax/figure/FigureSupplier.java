package core.basesyntax.figure;

import core.basesyntax.ColorSupplier;
import core.basesyntax.enumuration.Figures;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_LENGTH_SIDE = 51;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);

        switch (index) {
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomSquare();
        }
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH_SIDE));
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH_SIDE));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH_SIDE),
                random.nextInt(MAX_LENGTH_SIDE),
                random.nextInt(MAX_LENGTH_SIDE));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH_SIDE),
                random.nextInt(MAX_LENGTH_SIDE));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH_SIDE),
                random.nextInt(MAX_LENGTH_SIDE));
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), DEFAULT_CIRCLE_RADIUS);
    }
}

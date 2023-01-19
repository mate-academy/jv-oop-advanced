package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figureCount = 6;
    private final int defaultRadius = 10;

    private final int bound = 100;

    private final String defaultColor = "WHITE";

    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(bound));
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(),colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(bound),
                random.nextInt(bound));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(bound), random.nextInt(bound),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(bound),random.nextInt(bound),
                random.nextInt(bound), colorSupplier.getRandomColor());
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(figureCount);
        switch (figureIndex) {
            case 0: return getRandomIsoscelesTrapezoid();
            case 1: return getRandomCircle();
            case 2: return getRandomSquare();
            case 3: return getRandomRectangle();
            case 4: return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }
}

package basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();
    private final int figureCount = 50;

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(figureCount), randomColor.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(figureCount),
                random.nextInt(figureCount), random.nextInt(figureCount),
                randomColor.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(figureCount),
                random.nextInt(figureCount), randomColor.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(figureCount), random.nextInt(figureCount),
                randomColor.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(figureCount), randomColor.getRandomColor());
    }

    public Figure getRandomFigure() {
        final int figureCount = 5;
        int figureNumber = random.nextInt(figureCount);

        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final int radius = 10;
        return new Circle(radius, Color.WHITE);
    }
}


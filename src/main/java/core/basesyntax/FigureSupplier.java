package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String defaultColor = Color.WHITE.name();
    private final double defaultRadius = 10;
    private final int maxValues = 6;

    public Figure getRandomFigure() {
        int value = random.nextInt(maxValues);
        switch (value) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            case 5:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(maxValues));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(maxValues), random.nextInt(maxValues), random.nextInt(maxValues));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(maxValues), random.nextInt(maxValues));
    }

    private Figure getRandomRightTriangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(maxValues), random.nextInt(maxValues));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(maxValues));
    }
}

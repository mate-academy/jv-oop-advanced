package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int defaultRadius = 10;
    private final String defaultColor = "WHITE";
    private final int numberOfFigures = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int randomNumber = 100;

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(numberOfFigures);
        switch (randomFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(randomNumber));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(randomNumber),
                random.nextInt(randomNumber), random.nextInt(randomNumber));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(randomNumber), random.nextInt(randomNumber));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(randomNumber), random.nextInt(randomNumber));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(randomNumber));
    }
}

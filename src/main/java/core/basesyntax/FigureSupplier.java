package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    public static final int MAX_SIZE = 10;

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
        int figureNumber = random.nextInt(MAX_SIZE + 1);
        return new Square(colorSupplier.getRandomColor(), figureNumber);
    }

    private Figure getRandomRectangle() {
        int figureNumber = random.nextInt(MAX_SIZE + 1);
        return new Rectangle(colorSupplier.getRandomColor(), figureNumber, figureNumber);
    }

    private Figure getRandomRightTriangle() {
        int figureNumber = random.nextInt(MAX_SIZE + 1);
        return new RightTriangle(colorSupplier.getRandomColor(), figureNumber, figureNumber);
    }

    private Figure getRandomCircle() {
        int figureNumber = random.nextInt(MAX_SIZE + 1);
        return new Circle(colorSupplier.getRandomColor(), figureNumber);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int figureNumber = random.nextInt(MAX_SIZE + 1);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), figureNumber, figureNumber, figureNumber);
    }
}
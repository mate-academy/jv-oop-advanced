package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = FigureList.values().length;
    private static final int MAX_FIGURE_SIZE = 15;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Figure getRandomSquare() {
        int sideA = random.nextInt(MAX_FIGURE_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Square(sideA, color);
    }

    private Figure getRandomRectangle() {
        int sideA = random.nextInt(MAX_FIGURE_SIZE) + 1;
        int sideB = random.nextInt(MAX_FIGURE_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Rectangle(sideA, sideB, color);
    }

    private Figure getRandomRightTriangle() {
        int sideA = random.nextInt(MAX_FIGURE_SIZE) + 1;
        int sideB = random.nextInt(MAX_FIGURE_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(sideA, sideB, color);
    }

    private Figure getRandomCircle() {
        int sideA = random.nextInt(MAX_FIGURE_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Circle(sideA, color);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int sideA = random.nextInt(MAX_FIGURE_SIZE) + 1;
        int sideB = random.nextInt(MAX_FIGURE_SIZE) + 1;
        int height = random.nextInt(MAX_FIGURE_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(sideA, sideB, height, color);
    }
}

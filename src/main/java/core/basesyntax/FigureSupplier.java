package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_TYPE_COUNT = 5;
    public static final int MAX_LENGTH = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_TYPE_COUNT);
        String color = colorSupplier.getFigureColor();
        switch (figureNumber) {
            case 1: return createSquare(color);
            case 2: return createCircle(color);
            case 3: return createRectangle(color);
            case 4: return createRightTriangle(color);
            default: return createIsoTrapezoid(color);
        }
    }

    private Figure createSquare(String color) {
        int side = random.nextInt(MAX_LENGTH);
        return new Square(side, color);
    }

    private Figure createCircle(String color) {
        int radius = random.nextInt(MAX_LENGTH);
        return new Circle(radius, color);
    }

    private Figure createRectangle(String color) {
        int sideA = random.nextInt(MAX_LENGTH);
        int sideB = random.nextInt(MAX_LENGTH);
        return new Rectangle(sideA, sideB, color);
    }

    private Figure createRightTriangle(String color) {
        int sideA = random.nextInt(MAX_LENGTH);
        int sideB = random.nextInt(MAX_LENGTH);
        return new RightTriangle(sideA, sideB, color);
    }

    private Figure createIsoTrapezoid(String color) {
        int base = random.nextInt(MAX_LENGTH);
        int top = random.nextInt(MAX_LENGTH);
        int height = random.nextInt(MAX_LENGTH);
        return new IsoscelesTrapezoid(base, top, height, color);
    }
}

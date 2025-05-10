package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(NUMBER_OF_FIGURES);

        return switch (randomIndex) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomIsoTrapezoid();
            case 2 -> getRandomRectangle();
            case 3 -> getRandomRightTriangle();
            default -> getRandomSquare();
        };
    }

    public Circle getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_NUMBER) + 1;

        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid getRandomIsoTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int longBase = random.nextInt(MAX_NUMBER) + 1;
        int shortBase = random.nextInt(MAX_NUMBER) + 1;
        int height = random.nextInt(MAX_NUMBER) + 1;

        return new IsoscelesTrapezoid(color, longBase, shortBase, height);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = random.nextInt(MAX_NUMBER) + 1;
        int height = random.nextInt(MAX_NUMBER) + 1;

        return new Rectangle(color, length, height);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int base = random.nextInt(MAX_NUMBER) + 1;
        int height = random.nextInt(MAX_NUMBER) + 1;

        return new RightTriangle(color, base, height);
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_NUMBER) + 1;

        return new Square(color, side);
    }
}

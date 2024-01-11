package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int maxNumber = 10;

    public Figure getRandomFigure() {
        final int numberOfFigures = 5;
        int randomIndex = random.nextInt(numberOfFigures);

        return switch (randomIndex) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomIsoTrapezoid();
            case 2 -> getRandomRectangle();
            case 3 -> getRandomRightTriangle();
            default -> getRandomSquare();
        };
    }

    public Circle getDefaultFigure() {
        final int radius = 10;

        return new Circle(Color.WHITE.name(), radius);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(maxNumber) + 1;

        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid getRandomIsoTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int longBase = random.nextInt(maxNumber) + 1;
        int shortBase = random.nextInt(maxNumber) + 1;
        int height = random.nextInt(maxNumber) + 1;

        return new IsoscelesTrapezoid(color, longBase, shortBase, height);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = random.nextInt(maxNumber) + 1;
        int height = random.nextInt(maxNumber) + 1;

        return new Rectangle(color, length, height);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int base = random.nextInt(maxNumber) + 1;
        int height = random.nextInt(maxNumber) + 1;

        return new RightTriangle(color, base, height);
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(maxNumber) + 1;

        return new Square(color, side);
    }
}

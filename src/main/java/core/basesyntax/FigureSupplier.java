package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int LIMIT = 100;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int figureNumber = random.nextInt(NUMBER_OF_FIGURES + 1);
        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(LIMIT + 1));
            case 2:
                int bottom = random.nextInt(LIMIT + 1);
                int height = random.nextInt(LIMIT + 1);
                int top = random.nextInt(height + 1);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), top, bottom, height);
            case 3:
                int firstSide = random.nextInt(LIMIT + 1);
                int secondSide;
                do {
                    secondSide = random.nextInt(LIMIT + 1);
                } while (secondSide == firstSide);
                return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT + 1),
                        random.nextInt(LIMIT + 1));
            default:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(LIMIT + 1));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_RADIUS);
    }
}

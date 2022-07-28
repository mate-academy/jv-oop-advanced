package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_CONST_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int LIMIT = 100;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        int figureNumber = random.nextInt(1, NUMBER_OF_FIGURES);
        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(1, LIMIT));
            case 2:
                int bottom = random.nextInt(1, LIMIT);
                int height = random.nextInt(1, LIMIT);
                int top = random.nextInt(1, height);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), top, bottom, height);
            case 3:
                int firstSide = random.nextInt(1, LIMIT);
                int secondSide;
                do {
                    secondSide = random.nextInt(1, LIMIT);
                } while (secondSide == firstSide);
                return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(1, LIMIT),
                        random.nextInt(1, LIMIT));
            default:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(1, LIMIT));

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_CONST_RADIUS);
    }
}

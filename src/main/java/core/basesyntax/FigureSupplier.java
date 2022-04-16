package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE) + 1;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        /*I'm sorry, I have a question.
        Maybe I should use getRandomValues() when creating a new object?*/
        switch (random.nextInt(FIGURE_NUMBER)) {
            case 0:
                int radius = getRandomValue();
                return new Circle(color, radius);
            case 1:
                int upperBase = getRandomValue();
                int lowerBase = getRandomValue();
                int heightTrapezoid = getRandomValue();
                return new IsoscelesTrapezoid(color, upperBase, lowerBase, heightTrapezoid);
            case 2:
                int width = getRandomValue();
                int height = getRandomValue();
                return new Rectangle(color, width, height);
            case 3:
                int firstLeg = getRandomValue();
                int secondLeg = getRandomValue();
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                int side = getRandomValue();
                return new Square(color, side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_CIRCLE_RADIUS);
    }
}

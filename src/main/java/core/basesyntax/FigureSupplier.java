package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor().toLowerCase();
        Random random = new Random();
        int index = random.nextInt(Shape.values().length);
        Shape randomFigure = Shape.values()[index];
        switch (randomFigure) {
            case CIRCLE :
                return new Circle(randomColor, random.nextInt(BOUND) + 1);
            case ISOSCELES_TRAPEZOID :
                int longerBase = random.nextInt(BOUND) + 3;
                int shorterBase = random.nextInt(longerBase - 2) + 1;
                int height = random.nextInt(shorterBase) + 1;
                return new IsoscelesTrapezoid(randomColor, longerBase, shorterBase, height);
            case RECTANGLE :
                return new Rectangle(randomColor, random.nextInt(BOUND) + 1,
                        random.nextInt(BOUND) + 1);
            case RIGHT_TRIANGLE :
                return new RightTriangle(randomColor, random.nextInt(BOUND) + 1,
                        random.nextInt(BOUND) + 1);
            default:
                return new Square(randomColor, random.nextInt(BOUND) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS);
    }
}

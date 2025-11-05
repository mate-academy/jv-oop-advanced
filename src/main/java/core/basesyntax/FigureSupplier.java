package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndexOfFigureType = random.nextInt(FigureType.values().length);
        String randomFigureType = FigureType.values()[randomIndexOfFigureType].name();

        switch (randomFigureType) {
            case "CIRCLE" : {
                String color = colorSupplier.getRandomColor();
                int radius = random.nextInt(MAX_RANDOM_NUMBER);
                return new Circle(color, radius);
            }
            case "ISOSCELES_TRAPEZOID" : {
                String color = colorSupplier.getRandomColor();
                int firstBase = random.nextInt(MAX_RANDOM_NUMBER);
                int secondBase = random.nextInt(MAX_RANDOM_NUMBER);
                int height = random.nextInt(MAX_RANDOM_NUMBER);
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            }
            case "RECTANGLE" : {
                String color = colorSupplier.getRandomColor();
                int shorterSide = random.nextInt(MAX_RANDOM_NUMBER);
                int longerSide = random.nextInt(MAX_RANDOM_NUMBER);
                return new Rectangle(color, shorterSide, longerSide);
            }
            case "RIGHT_TRIANGLE" : {
                String color = colorSupplier.getRandomColor();
                int firstLeg = random.nextInt(MAX_RANDOM_NUMBER);
                int secondLeg = random.nextInt(MAX_RANDOM_NUMBER);
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            default:
                String color = colorSupplier.getRandomColor();
                int side = random.nextInt(MAX_RANDOM_NUMBER);
                return new Square(color, side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

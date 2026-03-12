package core.basesyntax;

import java.util.Random;
public class FigureSupplier {
    enum Figures {
        CIRCLE, SQUARE, RECTANGLE, RIGHT_TRIANGLE, ISOSCELES_TRAPEZOID
    }

    private final Random random = new Random();
    private final static int DEFAULT_SIZE = 10;

    public Figure getRandomFigure() {
        int MAX_SIZE = 100;
        String randomFigure = Figures.values()[random.nextInt(Figures.values().length)].name();
        int randomValue1= random.nextInt(MAX_SIZE);
        int randomValue2= random.nextInt(MAX_SIZE);
        int randomValue3= random.nextInt(MAX_SIZE);
        return switch (randomFigure) {
            case "CIRCLE" -> new Circle(randomValue1);
            case "SQUARE" -> new Square(randomValue1);
            case "RECTANGLE" -> new Rectangle(randomValue1, randomValue2);
            case "RIGHT_TRIANGLE" -> new RightTriangle(randomValue1, randomValue2);
            case "ISOSCELES_TRAPEZOID" ->
                    new IsoscelesTrapezoid(randomValue1, randomValue2, randomValue3);
            default -> getDefaultFigure();
        };
    }
    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_SIZE);
        defaultFigure.setColor(ColorSupplier.Color.WHITE.name());
        return defaultFigure;
    }
}

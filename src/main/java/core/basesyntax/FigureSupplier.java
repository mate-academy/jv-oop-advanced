package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int MAX_LENGTH = 11;
    private static final int FIGURE_COUNT = FigureType.values().length;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        FigureType figureType = FigureType.values()[figureIndex];
        String randomFigure = figureType.name();
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigure) {
            case "CIRCLE" -> new Circle(getRandomNumber(), randomColor);
            case "RECTANGLE" -> new Rectangle(getRandomNumber(), getRandomNumber(), randomColor);
            case "SQUARE" -> new Square(getRandomNumber(), randomColor);
            case "RIGHT_TRIANGLE" -> new RightTriangle(getRandomNumber(), getRandomNumber(),
                    randomColor);
            default -> new IsoscelesTrapezoid(getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber(),
                    randomColor);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_LENGTH);
    }
}

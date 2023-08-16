package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOUR = "white";
    private static final int RADIUS = 10;
    private static final int MAXSIZE = 13;
    private static final int TOTAL_FIGURE_AMOUNT = 6;
    private final Random random = new Random();
    private final ColourSupplier colourSupplier = new ColourSupplier();

    public Figure getDefaultFigure() {
        return new Circle(COLOUR, RADIUS);
    }

    public Figure getRandomFigure() {
        String randomColour = colourSupplier.getRandomColour();
        int randomFigureNumber = random.nextInt(TOTAL_FIGURE_AMOUNT);
        int randomFigureSide = random.nextInt(MAXSIZE);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(randomColour, randomFigureSide);
            case 1:
                return new Square(randomColour, randomFigureSide);
            case 2:
                return new RightTriangle(randomColour, randomFigureSide, randomFigureSide);
            case 3:
                return new Rectangle(randomColour, randomFigureSide, randomFigureSide);
            case 4:
                return new IsoscelesTrapezoid(randomColour, randomFigureSide,
                        randomFigureSide, randomFigureSide);
            default:
                return getDefaultFigure();
        }
    }
}

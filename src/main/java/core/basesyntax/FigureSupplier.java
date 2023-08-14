package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOUR = "white";
    private static final int RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    int randomFigureSide = random.nextInt(13);

    public Figure getDefaultFigure() {
        return new Circle(COLOUR, RADIUS);
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigureNumber = random.nextInt(6);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(randomColor, randomFigureSide);
            case 1:
                return new Square(randomColor, randomFigureSide);
            case 2:
                return new RightTriangle(randomColor, randomFigureSide, randomFigureSide);
            case 3:
                return new Rectangle(randomColor, randomFigureSide, randomFigureSide);
            case 4:
                return new IsoscelesTrapezoid(randomColor, randomFigureSide,
                        randomFigureSide, randomFigureSide);
            default:
                return getDefaultFigure();
        }
    }
}

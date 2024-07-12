package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int maxColorValue = 5;
        int randomNumber = random.nextInt(maxColorValue);
        int randomFigureParameters = random.nextInt();
        String figureColor = colorSupplier.getColor();

        switch (randomNumber) {
            case 0:
                return new Circle(randomFigureParameters,
                        figureColor);
            case 1:
                return new IsoscelesTrapezoid(randomFigureParameters,
                        randomFigureParameters,
                        randomFigureParameters,
                        figureColor);
            case 2:
                return new Rectangle(randomFigureParameters,
                        randomFigureParameters,
                        figureColor);
            case 3:
                return new RightTriangle(randomFigureParameters,
                        randomFigureParameters,
                        figureColor);
            default:
                return new Square(randomFigureParameters,
                        figureColor);
        }
    }

    public Figure getDefaultFigure() {
        String defaultColor = "white";
        int defaultRadius = 10;
        return new Circle(defaultRadius, defaultColor);
    }
}

package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigure = random.nextInt(5);
        String randomColor = colorSupplier.getRandomColor();

        switch (numberOfFigure) {
            case 0: {
                return new Circle(randomColor, getRandomValueForFigureParameter());
            }
            case 1: {
                return new IsoscelesTrapezoid(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            case 2: {
                return new Rectangle(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            case 3: {
                return new RightTriangle(randomColor,
                        getRandomValueForFigureParameter(),
                        getRandomValueForFigureParameter());
            }
            default: {
                return new Square(randomColor,
                        getRandomValueForFigureParameter());
            }
        }
    }

    private Double getRandomValueForFigureParameter() {
        int randomMultiplier = 100;
        return random.nextDouble(randomMultiplier);
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), 10);
    }
}

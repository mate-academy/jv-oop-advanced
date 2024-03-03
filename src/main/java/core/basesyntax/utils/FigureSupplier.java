package core.basesyntax.utils;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType randomFigureType = getRandomFigureType();
        double randomNumber = Math.round(random.nextDouble() * 10 + 1);
        double randomNumber2 = Math.round(random.nextDouble() * 10 + 1);
        double randomNumber3 = Math.round(random.nextDouble() * 10 + 1);

        switch (randomFigureType) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), randomNumber);
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), randomNumber);
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), randomNumber, randomNumber2);
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomNumber,
                        randomNumber2);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomNumber,
                        randomNumber2,
                        randomNumber3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private FigureType getRandomFigureType() {
        FigureType[] types = FigureType.values();
        int randomIndex = random.nextInt(types.length);
        return types[randomIndex];
    }

}

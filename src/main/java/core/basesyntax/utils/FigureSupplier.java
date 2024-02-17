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
        FigureType randomType = getRandomFigureType();
        double randomNumber = Math.round(random.nextDouble() * 10 + 1);
        double randomNumber2 = Math.round(random.nextDouble() * 10 + 1);
        double randomNumber3 = Math.round(random.nextDouble() * 10 + 1);

        switch (randomType) {
            case Circle:
                return new Circle(colorSupplier.getRandomColor(), randomNumber);
            case Square:
                return new Square(colorSupplier.getRandomColor(), randomNumber);
            case Rectangle:
                return new Rectangle(colorSupplier.getRandomColor(), randomNumber, randomNumber2);
            case RightTriangle:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomNumber,
                        randomNumber2);
            case IsoscelesTrapezoid:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomNumber,
                        randomNumber2,
                        randomNumber3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {

        return new Circle(10, Color.YELLOW);
    }

    private FigureType getRandomFigureType() {
        FigureType[] types = FigureType.values();
        int randomIndex = random.nextInt(types.length);
        return types[randomIndex];
    }

}

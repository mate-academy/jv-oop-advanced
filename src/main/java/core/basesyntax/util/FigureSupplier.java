package core.basesyntax.util;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int randomNumber = getRandomNumber(5);
        switch (randomNumber) {
            case 1:
                return new Square(getRandomNumber(100), getRandomColor());
            case 2:
                return new Rectangle(
                        getRandomNumber(100),
                        getRandomNumber(100),
                        getRandomColor()
                );
            case 3:
                return new RightTriangle(
                        getRandomNumber(100),
                        getRandomNumber(100),
                        getRandomColor()
                );
            case 4:
                return new Circle(getRandomNumber(100), getRandomColor());
            case 5:
                return new IsoscelesTrapezoid(
                        getRandomNumber(100),
                        getRandomNumber(100),
                        getRandomNumber(100),
                        getRandomColor()
                );
            default:
                return getDefaultFigure();
        }
    }

    /**
     * @param to end bound (inclusive)
     * @return a random integer between 1 and to (inclusive)
     */
    private int getRandomNumber(int to) {
        return random.nextInt(to) + 1;
    }

    private Color getRandomColor() {
        return Color.valueOf(colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}

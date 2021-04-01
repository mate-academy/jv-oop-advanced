package core.basesyntax.main;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_COUNT = 5;
    public static final int RANDOM_DOUBLE_MULTIPLE = 100;
    private final ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getRandomFigure() {
        int num = random.nextInt(FIGURES_COUNT) + 1;
        String figureColor = colorSupplier.generateColor().toString().toLowerCase();
        switch (num) {
            case 1: {
                return new Circle(figureColor, getRandomDouble());
            }
            case 2: {
                return new Rectangle(figureColor, getRandomDouble(), getRandomDouble());
            }
            case 3: {
                return new Square(figureColor, getRandomDouble());
            }
            case 4: {
                return new RightTriangle(figureColor, getRandomDouble(),
                        getRandomDouble());
            }
            case 5:
            default: {
                return new IsoscelesTrapezoid(figureColor, getRandomDouble(),
                        getRandomDouble(), getRandomDouble());
            }
        }
    }

    private double getRandomDouble() {
        return (random.nextDouble() * RANDOM_DOUBLE_MULTIPLE);
    }
}

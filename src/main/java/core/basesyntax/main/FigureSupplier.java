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
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
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
            case 5: {
                return new IsoscelesTrapezoid(figureColor, getRandomDouble(),
                        getRandomDouble(), getRandomDouble());
            }
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
    }

    private double getRandomDouble() {
        Random random = new Random();
        return (random.nextDouble() * 100);
    }
}

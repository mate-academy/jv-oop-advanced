package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.template.Figure;
import java.util.Random;

public class FigureSupplier {
    public static final Random random;
    public static final ColorSupplier colorSupplier;
    public static final int FIGURE_COUNT;
    public static final int MAX_BALL_NUMBER;

    static {
        random = new Random();
        colorSupplier = new ColorSupplier();
        FIGURE_COUNT = 5;
        MAX_BALL_NUMBER = 10;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BALL_NUMBER) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BALL_NUMBER) + 1,
                        random.nextInt(MAX_BALL_NUMBER) + 1);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BALL_NUMBER) + 1,
                        random.nextInt(MAX_BALL_NUMBER) + 1);
            case 4:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BALL_NUMBER) + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BALL_NUMBER) + 1,
                        random.nextInt(MAX_BALL_NUMBER) + 1,
                        random.nextInt(MAX_BALL_NUMBER) + 1);
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), MAX_BALL_NUMBER);
    }
}

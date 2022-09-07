package core.basesyntax.utils;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int MAX_FOR_NUMERICAL_FIGURE_FIELDS = 20;

    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    // but in my opinion `static` would be better
    public Figure getRandomFigure() {
        KnownFigureImpl[] knownFigureImpls = KnownFigureImpl.values();
        int randomIndex = random.nextInt(knownFigureImpls.length);
        KnownFigureImpl selectedImpl = knownFigureImpls[randomIndex];
        switch (selectedImpl) {
            case CIRCLE:
                int radius = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                return new Circle(colorSupplier.getRandomColor(), radius);
            case SQUARE:
                int side = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                return new Square(colorSupplier.getRandomColor(), side);
            case RECTANGLE:
                int sideA = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                int sideB = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                return new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
            case RIGHT_TRIANGLE:
                int firstLeg = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                int secondLeg = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case ISOSCELES_TRAPEZOID:
                int baseA = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                int baseB = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                int height = random.nextInt(MAX_FOR_NUMERICAL_FIGURE_FIELDS);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), baseA, baseB, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}

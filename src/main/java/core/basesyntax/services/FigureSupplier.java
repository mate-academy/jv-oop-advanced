package core.basesyntax.services;

import core.basesyntax.enums.Color;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 30;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int index = random.nextInt(core.basesyntax.enums.Figure.values().length);
        core.basesyntax.enums.Figure selectFigure = core.basesyntax.enums.Figure.values()[index];
        switch (selectFigure) {
            case CIRCLE:
                return new Circle(
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        colorSupplier.getRandomColor());
            case TRIANGLE:
                return new RightTriangle(
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        colorSupplier.getRandomColor());
            case TRAPEZOID:
            default:
                return new IsoscelesTrapezoid(
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        random.nextInt(MAX_LENGTH - 1) + 1,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}

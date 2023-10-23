package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureInstance;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FigureInstance.values().length);
        FigureInstance figureName = FigureInstance.values()[randomFigureIndex];

        switch (figureName) {
            case CIRCLE -> {
                return new Circle("circle",
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        colorSupplier.getRandomColor());
            }
            case SQUARE -> {
                return new Square("square",
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        colorSupplier.getRandomColor());
            }
            case RECTANGLE -> {
                return new Rectangle("rectangle",
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        colorSupplier.getRandomColor());
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle("right triangle",
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        colorSupplier.getRandomColor());
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid("isosceles trapezoid",
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        random.nextInt(MIN_LENGTH, MAX_LENGTH),
                        colorSupplier.getRandomColor());
            }
            default -> {
                return null;
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("circle",
                MAX_LENGTH,
                Color.WHITE);
    }

}

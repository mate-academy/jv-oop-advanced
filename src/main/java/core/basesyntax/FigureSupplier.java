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
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FigureInstance.values().length);
        FigureInstance figureName = FigureInstance.values()[randomFigureIndex];
        FigureSupplier figureSupplier = new FigureSupplier();

        switch (figureName) {
            case CIRCLE -> {
                return figureSupplier.getCircle();
            }
            case SQUARE -> {
                return figureSupplier.getSquare();
            }
            case RECTANGLE -> {
                return figureSupplier.getRectangle();
            }
            case RIGHT_TRIANGLE -> {
                return figureSupplier.getRightTriangle();
            }
            case ISOSCELES_TRAPEZOID -> {
                return figureSupplier.getIsoscelesTrapezoid();
            }
            default -> {
                return figureSupplier.getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("circle",
                MAX_LENGTH,
                Color.WHITE);
    }

    public Figure getCircle() {
        return new Circle("circle",
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                colorSupplier.getRandomColor());
    }

    public Figure getSquare() {
        return new Square("square",
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                colorSupplier.getRandomColor());
    }

    public Figure getRectangle() {
        return new Rectangle("rectangle",
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                colorSupplier.getRandomColor());
    }

    public Figure getRightTriangle() {
        return new RightTriangle("right triangle",
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                colorSupplier.getRandomColor());
    }

    public Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid("isosceles trapezoid",
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                random.nextInt(MIN_LENGTH, MAX_LENGTH),
                colorSupplier.getRandomColor());
    }

}

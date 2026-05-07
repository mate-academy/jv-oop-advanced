package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureType;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 100;
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int i = RANDOM.nextInt(FigureType.values().length);
        String color = colorSupplier.getRandomColor();

        return switch (FigureType.values()[i]) {
            case CIRCLE -> {
                double radius = RANDOM.nextDouble(MAX_SIZE);
                yield new Circle(radius, color);
            }

            case SQUARE -> {
                double side = RANDOM.nextDouble(MAX_SIZE);
                yield new Square(side, color);
            }

            case ISOSCELES_TRAPEZOID -> {
                double firstBase = RANDOM.nextDouble(MAX_SIZE);
                double secondBase = RANDOM.nextDouble(MAX_SIZE);
                double leg = RANDOM.nextDouble(MAX_SIZE);
                yield new IsoscelesTrapezoid(firstBase, secondBase, leg, color);
            }

            case RIGHT_TRIANGLE -> {
                double firstLeg = RANDOM.nextDouble(MAX_SIZE);
                double secondLeg = RANDOM.nextDouble(MAX_SIZE);
                yield new RightTriangle(firstLeg, secondLeg, color);
            }

            case RECTANGLE -> {
                double height = RANDOM.nextDouble(MAX_SIZE);
                double width = RANDOM.nextDouble(MAX_SIZE);
                yield new Rectangle(height, width, color);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}

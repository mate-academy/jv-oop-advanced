package core.basesyntax.figures;

import core.basesyntax.colors.ColorSupplier;
import core.basesyntax.colors.Colors;
import core.basesyntax.figures.shapes.Circle;
import core.basesyntax.figures.shapes.IsoscelesTrapezoid;
import core.basesyntax.figures.shapes.Rectangle;
import core.basesyntax.figures.shapes.RightTriangle;
import core.basesyntax.figures.shapes.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_DIMENSION = 10;
    private static final int MIN_RANDOM_DIMENSION = 1;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                int radius = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                return new Circle(color, radius);
            case 1:
                int side = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                return new Square(color, side);
            case 2:
                int width = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                int height = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                return new Rectangle(color, width, height);
            case 3:
                int firstLeg = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                int secondLeg = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                int base1 = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                int base2 = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                int trapezoidHeight = random.nextInt(MAX_RANDOM_DIMENSION) + MIN_RANDOM_DIMENSION;
                return new IsoscelesTrapezoid(color, base1, base2, trapezoidHeight);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), DEFAULT_RADIUS);
    }
}

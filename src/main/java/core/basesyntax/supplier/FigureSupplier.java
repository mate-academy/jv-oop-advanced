package core.basesyntax.supplier;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.entity.Circle;
import core.basesyntax.entity.IsoscelesTrapezoid;
import core.basesyntax.entity.Rectangle;
import core.basesyntax.entity.RightTriangle;
import core.basesyntax.entity.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 100;
    public static final int NUM_FIGURE_TYPES = 5;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    public static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUM_FIGURE_TYPES)) {
            case 0:
                return new Circle(
                        colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case 1:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 4:
            default:
                return new Square(
                        colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

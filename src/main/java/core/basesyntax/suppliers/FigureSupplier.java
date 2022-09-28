package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_VALUE = 10;
    private Random random;
    private Figures figures;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier supplier) {
        this.random = random;
        this.colorSupplier = supplier;
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Figures.values().length);
        figures = Figures.values()[index];
        String randomColor = colorSupplier.getRandomColor();
        switch (figures) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANDOM_VALUE), random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE), random.nextInt(MAX_RANDOM_VALUE));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }
}

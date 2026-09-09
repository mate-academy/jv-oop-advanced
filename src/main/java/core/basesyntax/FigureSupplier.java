package core.basesyntax;

// [ERROR] /Users/ansachuk/Desktop/PROJECTS/jv-oop-advanced/src/main/java/core/
// basesyntax/Figure.java:2:1: 'import' should be separated from previous line. [EmptyLineSeparator]

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIDE_BOUND = 20;
    private final Random random = new Random();
    private final ColorSupplier cs = new ColorSupplier(random);
    private final Figure defaultFigure = new Circle(Colors.white.name(), 10);
    private final int randomSideSize = random.nextInt(MAX_SIDE_BOUND);

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(Figures.values().length);
        String randomColor = cs.getRandomColor();

        switch (Figures.values()[figureIndex]) {
            case SQUARE:
                return new Square(randomColor,
                        randomSideSize);
            case RECTANGLE:
                return new Rectangle(randomColor,
                        randomSideSize,
                        random.nextInt(MAX_SIDE_BOUND));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        randomSideSize,
                        random.nextInt(MAX_SIDE_BOUND));
            case CIRCLE:
                return new Circle(randomColor,
                        randomSideSize);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        randomSideSize,
                        random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND));
            default:
                return defaultFigure;
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}

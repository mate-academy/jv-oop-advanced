package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final int maxSideBound = 20;
    private final Random random = new Random();
    private ColorSupplier cs = new ColorSupplier(random);
    private Figure defaultFigure = new Circle(Colors.WHITE, 10);

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(Figures.values().length);
        Colors randomColor = cs.getRandomColor();

        switch (Figures.values()[figureIndex]) {
            case SQUARE:
                return new Square(randomColor,
                        random.nextInt(maxSideBound));
            case RECTANGLE:
                return new Rectangle(randomColor,
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound));
            case CIRCLE:
                return new Circle(randomColor,
                        random.nextInt(maxSideBound));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound));
            default:
                return defaultFigure;
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}

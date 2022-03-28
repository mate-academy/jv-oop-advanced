package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int ALL_FIGURES = 4;
    private static final int MAX_FIGURE_PARAMETER = 50;
    private static final int STATIC_RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int figureNumber = random.nextInt(ALL_FIGURES);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER),
                        random.nextInt(MAX_FIGURE_PARAMETER),
                        random.nextInt(MAX_FIGURE_PARAMETER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER),
                        random.nextInt(MAX_FIGURE_PARAMETER));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER),
                        random.nextInt(MAX_FIGURE_PARAMETER));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FIGURE_PARAMETER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, STATIC_RADIUS);
    }
}

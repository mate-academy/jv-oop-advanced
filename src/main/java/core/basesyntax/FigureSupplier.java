package core.basesyntax;

import static core.basesyntax.FigureType.CIRCLE;
import static core.basesyntax.FigureType.ISOSCELESTRAPEZOID;
import static core.basesyntax.FigureType.RECTANGLE;
import static core.basesyntax.FigureType.RIGHTTRIANGLE;
import static core.basesyntax.FigureType.SQUARE;

import java.util.Random;

public class FigureSupplier {
    static final int RADIUS_CIRCLE = 10;
    private static final String NAME_FIGURE = "circle";
    private static final String WHITE_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public FigureAbstract getDefaultFigure() {
        return new Circle(NAME_FIGURE, WHITE_COLOR, RADIUS_CIRCLE);
    }

    public FigureAbstract getRandomFigure() {
        FigureType[] figures = FigureType.values();
        int index = random.nextInt(figures.length);
        FigureType figureType = figures[index];
        if (figureType == SQUARE) {
            return new Square(figureType.name().toLowerCase(),
                    colorSupplier.getRandomColor().toLowerCase(),
                    (int) (Math.random() * 101));
        } else if (figureType == CIRCLE) {
            return new Circle(figureType.name(),
                    colorSupplier.getRandomColor().toLowerCase(),
                    (int) (Math.random() * 101));
        } else if (figureType == RECTANGLE) {
            return new Rectangle(figureType.name(),
                    colorSupplier.getRandomColor().toLowerCase(),
                    (int) (Math.random() * 101),
                    (int) (Math.random() * 101));
        } else if (figureType == RIGHTTRIANGLE) {
            return new Rectangle(figureType.name(),
                    colorSupplier.getRandomColor().toLowerCase(),
                    (int) (Math.random() * 101),
                    (int) (Math.random() * 101));
        } else if (figureType == ISOSCELESTRAPEZOID) {
            return new IsoscelesTrapezoid(figureType.name(),
                    colorSupplier.getRandomColor().toLowerCase(),
                    (int) (Math.random() * 101),
                    (int) (Math.random() * 101),
                    (int) (Math.random() * 101));
        } else {
            return getDefaultFigure();
        }
    }
}

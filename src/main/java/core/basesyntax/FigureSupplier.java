package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIZE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int figureSize() {
        return random.nextInt(MAX_FIGURE_SIZE);
    }

    public Figure getRandomFigure() {
        Figures randomFigure = Figures.values()[random.nextInt(Figures.values().length)];
        switch (randomFigure) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), figureSize());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), figureSize());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), figureSize(), figureSize());
            case RIGHTTRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        figureSize(), figureSize());
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), figureSize(),
                        figureSize(), figureSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

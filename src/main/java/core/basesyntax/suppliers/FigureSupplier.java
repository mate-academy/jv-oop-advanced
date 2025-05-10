package core.basesyntax.suppliers;

import core.basesyntax.enums.FigureType;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {
    private static final FigureType[] FIGURE_TYPES = FigureType.values();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private SizeSupplier sizeSupplier = new SizeSupplier();
    private NameSupplier nameSupplier = new NameSupplier();

    public Figure getRandomFigure() {
        int index = sizeSupplier.getRandomArrayIndex(FIGURE_TYPES.length);
        FigureType figureType = FIGURE_TYPES[index];
        switch (figureType) {
            case CIRCLE:
                return new Circle(nameSupplier.getCircleName(),
                        colorSupplier.getRandomColor(),
                        sizeSupplier.getRandomRadiusSize());
            case TRIANGLE:
                return new RightTriangle(nameSupplier.getTriangleName(),
                        colorSupplier.getRandomColor(),
                        sizeSupplier.getRandomLegSize(), sizeSupplier.getRandomLegSize());
            case RECTANGLE:
                return new Rectangle(nameSupplier.getRectangleName(),
                        colorSupplier.getRandomColor(),
                        sizeSupplier.getRandomSideSize(), sizeSupplier.getRandomSideSize());
            case SQUARE:
                return new Square(nameSupplier.getSquareName(),
                        colorSupplier.getRandomColor(),
                        sizeSupplier.getRandomSideSize());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(nameSupplier.getTrapezoidName(),
                        colorSupplier.getRandomColor(),
                        sizeSupplier.getRandomBaseSize(),
                        sizeSupplier.getRandomBaseSize(), sizeSupplier.getRandomHeightSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(nameSupplier.getCircleName(), colorSupplier.getDefaultColor(),
                sizeSupplier.getDefaultRadiusSize());
    }
}

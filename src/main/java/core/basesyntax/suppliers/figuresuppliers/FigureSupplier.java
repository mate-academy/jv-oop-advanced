package core.basesyntax.suppliers.figuresuppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;

public class FigureSupplier {
    private static final int DEFAULT_SIDE_LENGTH = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final FigureGenerator figureGenerator = new FigureGenerator();

    public Figure getRandomFigure(int type) {
        Figure figure;
        switch (type) {
            case 1:
                figure = figureGenerator.getCircle();
                break;
            case 2:
                figure = figureGenerator.getIsoscelesTrapezoid();
                break;
            case 3:
                figure = figureGenerator.getRectangle();
                break;
            case 4:
                figure = figureGenerator.getRightTriangle();
                break;
            case 5:
                figure = figureGenerator.getSquare();
                break;
            default:
                figure = getDefualtFigure();
        }
        return figure;
    }

    public Figure getDefualtFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_SIDE_LENGTH);
    }
}

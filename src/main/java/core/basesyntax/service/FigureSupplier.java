package core.basesyntax.service;

import core.basesyntax.Colors;
import core.basesyntax.Figure;
import core.basesyntax.Figures;
import core.basesyntax.entity.Circle;
import core.basesyntax.entity.IsoscelesTrapezoid;
import core.basesyntax.entity.Rectangle;
import core.basesyntax.entity.RightTriangle;
import core.basesyntax.entity.Square;
import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Figure figure = null;
        int randomFigureNumber = new Random().nextInt(Figures.values().length);

        switch (Figures.values()[randomFigureNumber]) {
            case SQUARE:
                figure = new Square();
                break;
            case RECTANGLE:
                figure = new Rectangle();
                break;
            case CIRCLE:
                figure = new Circle();
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle();
                break;
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid();
                break;
            default:
                figure = getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE);
    }
}

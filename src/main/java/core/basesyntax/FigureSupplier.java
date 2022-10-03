package core.basesyntax;

import static core.basesyntax.Color.WHITE;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(FigureTypes.values().length);
        FigureTypes newFigureType = FigureTypes.values()[figureIndex];
        switch (newFigureType) {
            case CIRCLE: return new Circle().buildFigure();
            case SQUARE: return new Square().buildFigure();
            case RECTANGLE: return new Rectangle().buildFigure();
            case RIGRHTTRIANGLE: return new RightTriangle().buildFigure();
            case ISOSCELESTRAPEZOID: return new IsoscelesTrapezoid().buildFigure();
            default: return null;
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, 10);
    }
}

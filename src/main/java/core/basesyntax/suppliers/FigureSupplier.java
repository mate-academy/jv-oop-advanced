package core.basesyntax.suppliers;

import core.basesyntax.Colors;
import core.basesyntax.FigureTypes;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(CIRCLE_RADIUS);
        defaultFigure.setColor(Colors.WHITE);
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        Random random = new Random();

        int figureIndex = random.nextInt(FigureTypes.values().length);
        FigureTypes figureToGenerate = FigureTypes.values()[figureIndex];

        switch (figureToGenerate) {
            case SQUARE : {
                int randomFirstSide = random.nextInt(100);
                return new Square(randomFirstSide);
            }
            case RECTANGLE: {
                int randomFirstSide = random.nextInt(100);
                int randomSecondSide = random.nextInt(100);
                return new Rectangle(randomFirstSide,randomSecondSide);
            }
            case RIGHT_TRIANGLE: {
                int randomFirstSide = random.nextInt(100);
                int randomSecondSide = random.nextInt(100);
                return new RightTriangle(randomFirstSide,randomSecondSide);
            }
            case ISOSCELES_TRAPEZOID: {
                int randomFirstSide = random.nextInt(100);
                int randomSecondSide = random.nextInt(100);
                int randomHeight = random.nextInt(100);
                return new IsoscelesTrapezoid(randomFirstSide,randomSecondSide,randomHeight);
            }
            default: {
                int randomFirstSide = random.nextInt(100);
                return new Circle(randomFirstSide);
            }
        }
    }

}

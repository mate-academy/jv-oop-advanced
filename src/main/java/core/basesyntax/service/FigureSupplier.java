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
    private static final int DEFAULT_VALUE = 10;
    private static final int MAX_VALUE = 100;
    private Random random = new Random();

    public Figure getRandom() {
        int randomFigureNumber = random.nextInt(Figures.values().length);

        switch (Figures.values()[randomFigureNumber]) {
            case SQUARE:
                return new Square(getDefaultValue());
            case RECTANGLE:
                return new Rectangle(getDefaultValue(), getDefaultValue());
            case CIRCLE:
                return new Circle(getDefaultValue());
            case RIGHTTRIANGLE:
                return new RightTriangle(getDefaultValue(), getDefaultValue());
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(getDefaultValue(),
                        getDefaultValue(), getDefaultValue());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle(DEFAULT_VALUE);
        defaultCircle.setColor(Colors.WHITE.name());
        return defaultCircle;
    }

    private int getDefaultValue() {
        return random.nextInt(MAX_VALUE);
    }
}

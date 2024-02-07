package core.basesyntax.suplier;

import core.basesyntax.Color;
import core.basesyntax.FigureName;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;

public class FigureSupplier extends RandomSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        switch (FigureName.values()[getRandom().nextInt(FigureName.values().length)]) {
            case CIRCLE:
                int radius = getRandomValue();
                figure = new Circle(colorSupplier.getRandomColor(), radius);
                break;
            case SQUARE:
                int side = getRandomValue();
                figure = new Square(colorSupplier.getRandomColor(), side);
                break;
            case RECTANGLE:
                int width = getRandomValue();
                int length = getRandomValue();
                figure = new Rectangle(colorSupplier.getRandomColor(), width, length);
                break;
            case RIGHT_TRIANGLE:
                int firstLeg = getRandomValue();
                int secondLeg = getRandomValue();
                figure = new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
                break;
            default:
                int upSide = getRandomValue();
                int lowSide = getRandomValue();
                int height = getRandomValue();
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        upSide, lowSide, height);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}

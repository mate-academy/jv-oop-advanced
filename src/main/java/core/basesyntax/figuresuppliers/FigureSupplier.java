package core.basesyntax.figuresuppliers;

import core.basesyntax.color.ColorSupplier;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int sizeOne = new Random().nextInt(10) + 1;
        int sizeTwo = new Random().nextInt(10) + 1;
        int sizeThree = new Random().nextInt(10) + 1;

        int index = new Random().nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];

        switch (figureType) {
            case SQUARE:
                return new Square(ColorSupplier.getRandomColor(), sizeOne);
            case RECTANGLE:
                return new Rectangle(ColorSupplier.getRandomColor(), sizeOne, sizeTwo);
            case RIGHT_TRIANGLE:
                return new RightTriangle(ColorSupplier.getRandomColor(), sizeOne, sizeTwo);
            case CIRCLE:
                return new Circle(ColorSupplier.getRandomColor(), sizeOne);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        sizeOne, sizeTwo, sizeThree);
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

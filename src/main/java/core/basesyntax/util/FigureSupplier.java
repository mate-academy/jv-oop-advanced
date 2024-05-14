package core.basesyntax.util;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {
    private Colors randomColor = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure(int a) {
        switch (a) {
            case 1:
                return new Circle(randomColor);
            case 2:
                return new IsoscelesTrapezoid(randomColor);
            case 3:
                return new Rectangle(randomColor);
            case 4:
                return new RightTriangle(randomColor);
            case 5:
                return new Square(randomColor);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);

    }

}

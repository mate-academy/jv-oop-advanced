package core.basesyntax;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.service.Figure;
import core.basesyntax.supplier.ColorSupplier;
import core.basesyntax.supplier.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);
        Figure[] figures = new Figure[]{
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                new Square(Color.BLACK.name(), 4),
                new RightTriangle(Color.YELLOW.name(), 3, 2),
                new Rectangle(Color.BLUE.name(), 5, 2)
        };

        for (int i = 0; i < figures.length; i++) {
            figures[i].drawFigure();
        }
    }
}

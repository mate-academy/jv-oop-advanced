package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.ColorSupplier;
import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;
import core.basesyntax.model.Square;
import core.basesyntax.model.Triangle;

public class FigureApp {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = {
                new Circle("Circle", 25.5, colorSupplier.getRandomColor(), 5),
                new Square("Square", 169, colorSupplier.getRandomColor(), 13),
                new Triangle("Tri", 40, colorSupplier.getRandomColor(), 8, 5),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure()
        };

        for (Figure el : figures) {
            System.out.println(el);
        }
    }
}

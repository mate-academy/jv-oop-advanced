package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.model.Figure;
import core.basesyntax.services.FigureSupplier;

public class Application {
    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
                new Circle(), new IsoscelesTrapezoid(),
                new Rectangle(),
                new RightTriangle(),
                new Square(),
                new FigureSupplier().getDefaultFigure(),
                new FigureSupplier().getDefaultFigure(),
                new FigureSupplier().getDefaultFigure()
        };
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

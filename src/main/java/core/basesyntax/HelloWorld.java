package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class HelloWorld {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = {
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                new Circle(27),
                new Square(15),
                new RightTriangle(25,30)
        };
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}

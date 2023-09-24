package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.services.FigureSupplier;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[]{
                figureSupplier.getRandomFigure("new Circle()"),
                figureSupplier.getRandomFigure("new IsoscelesTrapezoid()"),
                figureSupplier.getRandomFigure("new Rectangle()"),
                figureSupplier.getRandomFigure("new RightTriangle()"),
                figureSupplier.getRandomFigure("new Square()"),
                figureSupplier.getRandomFigure("If not a figure name, returns a default figure"),
                figureSupplier.getDefaultFigure()};
        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}

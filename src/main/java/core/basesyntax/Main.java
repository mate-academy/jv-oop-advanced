package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class Main {
    public static void main(String[] args) {
        final Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        Figure[] figures = new Figure[6];
        figures[3] = new Square("black", 5);
        figures[4] = new RightTriangle("yellow", 5, 4);
        figures[5] = defaultFigure;

        for (int i = 0; i < 3; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Figure: " + figures[i].getClass().getSimpleName() + ", area: "
                    + figures[i].getArea() + " sq. units," + figures[i].getFigureInfo()
                    + " color: " + figures[i].getColor().toLowerCase());
        }
    }
}

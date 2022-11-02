package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Random;

public class Main {
    private static  FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[new Random().nextInt(6)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        figures[3] = new Circle("WHITE", 6);
        figures[4] = new Square("RED", 4);

        for (Figure figure: figures) {
            figure.draw();
        }
    }


}

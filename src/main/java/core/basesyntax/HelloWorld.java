package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure figure1 = figureSupplier.getRandomFigure();
        Figure figure2 = figureSupplier.getRandomFigure();
        Figure figure3 = figureSupplier.getRandomFigure();

        Figure figure4 = figureSupplier.getDefaultFigure();
        Figure figure5 = figureSupplier.getDefaultFigure();
        Figure figure6 = figureSupplier.getDefaultFigure();

        List<Figure> figures = new ArrayList<>();
        figures.add(figure1);
        figures.add(figure2);
        figures.add(figure3);
        figures.add(figure4);
        figures.add(figure5);
        figures.add(figure6);

        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}

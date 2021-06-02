package mainnew;

import behavior.Figure;
import behavior.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = FigureSupplier.getRandomFigureArray();
        figureSupplier.printFiguresArray(figures);
    }
}

package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getDefaultFigure();
        /**
         * Next I can't how do I implement the print() method
         */
    }
}

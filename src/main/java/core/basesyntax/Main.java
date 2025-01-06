package core.basesyntax;

public class Main {
    public static void main (String[] args) {


     FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomFigure = figureSupplier.getRandomFigure();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
    }
}

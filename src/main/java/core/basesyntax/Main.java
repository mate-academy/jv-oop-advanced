package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int numberCycles = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[numberCycles];
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getRandomFigure();
        figures[3] = figureSupplier.getDefaultFigure();
        figures[4] = figureSupplier.getDefaultFigure();
        figures[5] = figureSupplier.getDefaultFigure();
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}

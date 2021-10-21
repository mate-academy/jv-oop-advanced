package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int numberCycles = 6;
        Figure[] figures = new Figure[numberCycles];
        for (int i = 0; i < numberCycles; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            if (i < numberCycles / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i]);
        }
    }
}

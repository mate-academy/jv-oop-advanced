package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int index = FigureSupplier.getFigureCount();
        Figure [] figureTable = new Figure[index];

        for (int i = 0; i < figureTable.length / 2; i++) {
            figureTable[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figureTable.length / 2; i < figureTable.length; i++) {
            figureTable[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure f : figureTable) {
            f.draw();
        }
    }
}


package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] allFigures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < allFigures.length / 2; i++) {
            allFigures[i] = figureSupplier.getRandomFigure();
            allFigures[i].draw();
        }
        for (int i = allFigures.length / 2; i < allFigures.length; i++) {
            allFigures[i] = figureSupplier.getDefaultFigure();
            allFigures[i].draw();
        }
    }
}

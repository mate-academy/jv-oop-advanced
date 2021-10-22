package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] generatedFigures = new Figure[6];
        for (int i = 0; i < generatedFigures.length; i++) {
            if (i > 2) {
                generatedFigures[i] = figureSupplier.getDefaultFigure();
            } else {
                generatedFigures[i] = figureSupplier.getRandomFigure();
            }
            generatedFigures[i].drawFigure();
        }
    }
}

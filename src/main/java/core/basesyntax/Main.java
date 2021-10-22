package core.basesyntax;

public class Main {
    private static final int DEFAULT_NUMBER = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] generatedFigures = new Figure[DEFAULT_NUMBER];
        for (int i = 0; i < generatedFigures.length; i++) {
            if (generatedFigures.length / 2 > 2) {
                generatedFigures[i] = figureSupplier.getDefaultFigure();
            } else {
                generatedFigures[i] = figureSupplier.getRandomFigure();
            }
            generatedFigures[i].draw();
        }
    }
}

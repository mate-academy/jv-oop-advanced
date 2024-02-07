package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_GENERATED_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] generatedFigures = new Figure[NUMBER_OF_GENERATED_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < generatedFigures.length; i++) {
            if (i < generatedFigures.length / 2) {
                generatedFigures[i] = figureSupplier.getRandomFigure();
            } else {
                generatedFigures[i] = figureSupplier.getDefaultCircle();
            }
            generatedFigures[i].draw();
        }
    }
}

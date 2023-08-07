package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final int NUMBER_OF_RANDOM_FIGURES = 3;
    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for(int i = 0; i < NUMBER_OF_RANDOM_FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for(int i = 3; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for(Figure figure: figures) {
            figure.draw();
        }
    }
}

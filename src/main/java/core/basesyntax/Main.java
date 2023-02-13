package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
        }
        for(Figure figure : figures) {
            figure.draw();
        }
    }
}

package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}

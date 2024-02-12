package core.basesyntax;

public class Main {
    public static final int AMOUNT_OF_FIGURES = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[AMOUNT_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; ++i) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

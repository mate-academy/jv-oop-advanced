package core.basesyntax;

public class Main {
    private static final int AMOUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[AMOUNT_OF_FIGURES];
        int middleOfFigureArray = AMOUNT_OF_FIGURES / 2;
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < middleOfFigureArray)
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

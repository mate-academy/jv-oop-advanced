package core.basesyntax;

public class Main {
    private static int ARRAY_LENGTH = 11;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i <= figures.length / 2) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

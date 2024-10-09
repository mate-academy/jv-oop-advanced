package core.basesyntax;

public class Application {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[ARRAY_SIZE];

        for (int i = 0; i < figures.length; i++) {
            if (i <= ARRAY_SIZE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else if (i > ARRAY_SIZE / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

package core.basesyntax;

public class Main {
    private static final Figure[] figures = new Figure[6];
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

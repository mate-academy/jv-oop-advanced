package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        final int amountFigures = 6;
        final int half = 3;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[amountFigures];

        for (int i = 0; i < half; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = half; i < amountFigures; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

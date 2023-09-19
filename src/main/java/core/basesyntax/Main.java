package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figuresArraySize = 6;
        Figure[] figures = new Figure[figuresArraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figuresArraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figuresArraySize / 2; i < figuresArraySize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

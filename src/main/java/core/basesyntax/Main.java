package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int figureArrayLength = 6;
        Figure [] figures = new Figure[figureArrayLength];
        for (int i = 0; i < figureArrayLength; i++) {
            if (i == figureArrayLength - 1) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}


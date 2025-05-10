package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int figuresArrayLength = 6;

        Figure[] figures = new Figure[figuresArrayLength];
        for (int i = 0; i < figuresArrayLength; i++) {
            if (i > (figuresArrayLength / 2 - 1)) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}

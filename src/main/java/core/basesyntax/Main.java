package core.basesyntax;

public class Main {
    static final int NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER];
        for (int i = 0; i < NUMBER; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i > 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }

    }
}


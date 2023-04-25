package core.basesyntax;

public class Main {
    private static final int CONSTANT = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[CONSTANT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < CONSTANT; i++) {
            if (i > 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure figure : figures) {
            figure.displayProperty();
        }
    }
}

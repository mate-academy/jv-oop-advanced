package core.basesyntax;

public class Main {
    private static final int DRAWINGS_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[DRAWINGS_NUMBER];

        for (int i = 0; i < DRAWINGS_NUMBER; i++) {
            if (i <= (DRAWINGS_NUMBER / 2 - 1)) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            }
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

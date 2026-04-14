package core.basesyntax;

public class Main {
    private static final int MAX_FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[MAX_FIGURES_NUMBER];

        for (int i = 0; i < MAX_FIGURES_NUMBER; i++) {
            if (i < MAX_FIGURES_NUMBER / 2) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

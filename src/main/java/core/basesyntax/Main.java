package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURES_COUNT / 2; i++) { //make half array random generation
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = FIGURES_COUNT / 2; i < FIGURES_COUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}


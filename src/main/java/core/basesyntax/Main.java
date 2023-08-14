package core.basesyntax;

public class Main {
    public static final int NUM_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUM_OF_FIGURES];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}


package core.basesyntax;

public class Main {
    protected static final int NUMBER_OF_FIGURES = 7;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure(i);
            figures[i].draw();
        }
    }

}

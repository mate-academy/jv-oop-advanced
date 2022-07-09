package core.basesyntax;

public class Main {
    public static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figures[] figure = new Figures[SIZE_OF_ARRAY];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}

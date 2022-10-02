package core.basesyntax;

public class Main {
    public static final int FIGURE_AMOUNT = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[FIGURE_AMOUNT];
        for (int i = 0; i < array.length; i++) {
            array[i] = i < array.length / 2 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            array[i].toDraw();
        }
    }
}

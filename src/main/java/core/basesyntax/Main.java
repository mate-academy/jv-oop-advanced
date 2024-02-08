package core.basesyntax;

public class Main {
    public static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            figures[i] = (i < ARRAY_LENGTH / 2)
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}

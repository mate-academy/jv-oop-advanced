package core.basesyntax;

public class Application {
    public static final int ARRAY_LENGTH = 7;
    public static final int HALF_OF_ARRAY = ARRAY_LENGTH / 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < HALF_OF_ARRAY)
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}

package core.basesyntax;

public class Application {
    public static final int ARRAY_LENGHT = 6;
    public static final int HALF_ARRAY = ARRAY_LENGHT / 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGHT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < HALF_ARRAY) ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}

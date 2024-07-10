package core.basesyntax;

public class Main {
    private static final int SIZEOFARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZEOFARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < SIZEOFARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}

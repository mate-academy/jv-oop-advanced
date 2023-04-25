package core.basesyntax;

public class Main {
    private static int MAX_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_FIGURES];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}

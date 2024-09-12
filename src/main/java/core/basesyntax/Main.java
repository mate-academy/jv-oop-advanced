package core.basesyntax;

public class Main {
    public static final int arraySize = 6;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}

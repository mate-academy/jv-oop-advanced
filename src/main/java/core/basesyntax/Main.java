package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int Size_Array = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[Size_Array];

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

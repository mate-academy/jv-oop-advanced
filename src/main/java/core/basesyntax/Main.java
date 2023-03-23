package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}

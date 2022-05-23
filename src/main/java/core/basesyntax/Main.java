package core.basesyntax;

public class Main {
    public static final int numberSix = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[numberSix];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}

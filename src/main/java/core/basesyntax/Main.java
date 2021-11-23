package core.basesyntax;

public class Main {
    private static final int MAX_NUMBER_OF_FIGURES = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[(int) (Math.random() * MAX_NUMBER_OF_FIGURES)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}


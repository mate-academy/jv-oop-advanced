package core.basesyntax;

public class Main {
    private static final int MAX_AMOUNT_OF_FIGURES = 20;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        Figure[] figures = new Figure[(int) (Math.random() * MAX_AMOUNT_OF_FIGURES)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

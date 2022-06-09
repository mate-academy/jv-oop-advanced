package core.basesyntax;

public class Main {
    private static int quantity = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[quantity];
        FigureSupplier newFigure = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = newFigure.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = newFigure.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

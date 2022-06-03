package core.basesyntax;

public class Main {
    private static int quantity = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[quantity];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.getDraw();
        }
    }
}

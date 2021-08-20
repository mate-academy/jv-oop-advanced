package core.basesyntax;

public class MainApp {
    private static final int MAX_LENGTH_OF_ARRAY = 10;

    public static void main(String[] args) {
        int arraysLength = (int)(1 * Math.random() * MAX_LENGTH_OF_ARRAY);
        Figure[] figures = new Figure[arraysLength];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.drawFigure();
        }
    }
}

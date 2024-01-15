package core.basesyntax;

public class App {
    public static final int FIGURE_ARRAY_LENGTH = 6;
    public static FigureSupplier figureSupplier = new FigureSupplier();
    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_ARRAY_LENGTH];
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultfFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].getFigureInformation();
        }
    }
}

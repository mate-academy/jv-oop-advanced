package core.basesyntax;

public class MainApp {
    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drawFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].drawFigure();
            }
        }
    }
}

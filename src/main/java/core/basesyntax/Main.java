package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURE];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2)
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.display();
        }
    }
}

package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure(colorSupplier.getRandomColor());
        }
        for (int i = 3; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}


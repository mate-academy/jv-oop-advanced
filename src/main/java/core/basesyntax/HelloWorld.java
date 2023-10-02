package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        final int NUMBER_OF_FIGURES = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }

}

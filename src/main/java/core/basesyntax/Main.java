package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final double RANDOM_NUMBER = 3;

    public static void main(String[] args) {
        int i;
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figureArray = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (i = 0; i < figureArray.length / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }

        while (i < figureArray.length) {
            figureArray[i++] = new Circle(colorSupplier.getRandomColor(),RANDOM_NUMBER);
        }

        for (Figure figure: figureArray) {
            figure.draw();
        }
    }
}

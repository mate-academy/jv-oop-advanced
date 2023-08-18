package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        ColoredFigure[] figures = new ColoredFigure[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            figures[i] = (ColoredFigure) new FigureSupplier().getRandomFigure();
        }

        for (int i = ARRAY_SIZE / 2; i < ARRAY_SIZE; i++) {
            figures[i] = (ColoredFigure) new FigureSupplier().getDefaultFigure();
        }

        for (ColoredFigure figure : figures) {
            figure.draw();
        }
    }
}

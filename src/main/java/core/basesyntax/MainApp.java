package core.basesyntax;

public class MainApp {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        int arraySize = ARRAY_SIZE;
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure(randomColor);
            figures[i].draw();
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            Figure defaultFigure = figureSupplier.getDefaultFigure();
            figures[i] = defaultFigure;
            figures[i].draw();
        }
    }
}

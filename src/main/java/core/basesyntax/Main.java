package core.basesyntax;

public class Main {
    static final int ARRAY_SIZE = 6;
    static final double DEFAULT_FIG_PART = 0.5;

    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] figArray = new Figure[ARRAY_SIZE];
        for (int i = 0; (double) i < (double) figArray.length * DEFAULT_FIG_PART; i++) {
            figArray[i] = figure.getDefaultFigure();
        }
        for (int j = (int) (figArray.length * DEFAULT_FIG_PART); j < figArray.length; j++) {
            figArray[j] = figure.getRandomFigure();
        }
        for (Figure element : figArray) {
            element.draw();
        }
    }
}

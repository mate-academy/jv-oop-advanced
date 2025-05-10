package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[ARRAY_LENGTH];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < figuresArray.length; i++) {
            if (i <= figuresArray.length / 2) {
                figuresArray[i] = supplier.getRandomFigure();
            } else {
                figuresArray[i] = supplier.getDefaultFigure();
            }
        }
        for (Figure figure : figuresArray) {
            figure.printInfo();
        }
    }
}

package core.basesyntax;

public class Main {
    private static final int MAGIC_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[MAGIC_NUMBER];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < 2; i++) {
            figuresArray[i] = supplier.getRandomFigure();
        }
        for (int i = 3; i < 5; i++) {
            figuresArray[i] = supplier.getDefaultFigure();
        }
        for (Figure figure : figuresArray) {
            figure.printInfo();
        }
    }
}

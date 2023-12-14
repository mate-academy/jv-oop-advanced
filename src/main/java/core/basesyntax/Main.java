package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figureSupplier.getRandomFigure().printInfo();
            } else {
                figureSupplier.getDefaultFigure().printInfo();
            }
        }
    }
}

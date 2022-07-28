package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            if (i >= 3) {
                figureArray[i] = supplier.getDefaultFigure();
                continue;
            }
            figureArray[i] = supplier.getRandomFigure();
        }
        for (Figure figure : figureArray) {
            figure.drawFigure();
        }
    }
}

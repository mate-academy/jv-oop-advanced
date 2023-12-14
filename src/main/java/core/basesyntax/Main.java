package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int size = 6;
        Figure[] figureArray = new Figure[size];
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                figureArray[i] = FigureSupplier.getRandomFigure();
            } else {
                figureArray[i] = FigureSupplier.getDefaultFigure();
            }
        }
        for (int j = 0; j < size; j++) {
            figureArray[j].draw();
        }
    }
}

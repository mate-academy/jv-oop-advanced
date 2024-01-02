package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] result = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < result.length; i++) {
            if (i >= result.length / 2) {
                result[i] = figureSupplier.getDefaultFigure();
            } else {
                result[i] = figureSupplier.getRandomFigure();
            }
            result[i].draw();
        }
    }
}

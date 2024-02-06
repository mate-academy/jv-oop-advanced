package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arrayValue = 6; //count of elements in array
        Figure[] figure = new Figure[arrayValue];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arrayValue; i++) {
            if (i < arrayValue / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < arrayValue; i++) {
            figure[i].draw();
        }
    }
}

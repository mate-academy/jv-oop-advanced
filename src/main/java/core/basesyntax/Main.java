package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        int sizeArray = 20;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] arrayFigurs = new Figure[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            if (i < sizeArray / 2) {
                arrayFigurs[i] = figureSupplier.getRandomFigureName();
            } else {
                arrayFigurs[i] = figureSupplier.getDefaultFigure();
            }
        }
    }
}

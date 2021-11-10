package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int arrayLength = 10;
        int arrayHalf = arrayLength / 2;

        for (int i = 0; i < arrayLength; i++) {
            if (i < arrayHalf) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                randomFigure.getArea();
                randomFigure.draw();
            } else {
                Figure defaultFigure = figureSupplier.getDefaultFigure();
                defaultFigure.getArea();
                defaultFigure.draw();
            }
        }
    }
}

package core.basesyntax;


public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
    Figure [] arrayFigures = new Figure[6];
    for (int i = 0; i < arrayFigures.length ; i++) {
        if (i < (arrayFigures.length / 2)) {
            arrayFigures[i] = figureSupplier.getRandomFigure();
            arrayFigures[i].draw();
        } else {
            arrayFigures[i] = figureSupplier.getDefoultFigure();
            arrayFigures[i].draw();
        }
    }
    }
}

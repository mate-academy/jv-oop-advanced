package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        int arraySize = 6; // array size
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }

            System.out.println("figure: " + figures[i].getName() + ", square: "
                    + figures[i].calculateArea() + " sq.units., " + figures[i].draw());
        }
    }
}

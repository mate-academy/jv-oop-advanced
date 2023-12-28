package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 6; // array size
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            if (i < figures.length / 2) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                figures[i] = randomFigure;
            } else {
                Figure defaultFigure = figureSupplier.getDefaultFigure();
                figures[i] = defaultFigure;
            }

            if (figures[i] != null) {
                System.out.println("figure: " + figures[i].getName() + ", square: "
                        + figures[i].calculateArea() + " sq.units., " + figures[i].draw());
            }
        }
    }
}

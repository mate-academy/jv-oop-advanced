package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 6; // array size
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                if (randomFigure != null) {
                    figures[i] = randomFigure;
                } else {
                    System.out.println("Null figure received from getRandomFigure()");
                }
            } else {
                Figure defaultFigure = figureSupplier.getDefaultFigure();
                if (defaultFigure != null) {
                    figures[i] = defaultFigure;
                } else {
                    System.out.println("Null figure received from getDefaultFigure()");
                }
            }

            if (figures[i] != null) {
                System.out.println("figure: " + figures[i].getName() + ", square: "
                        + figures[i].calculateArea() + " sq.units., " + figures[i].draw());
            }
        }
    }
}

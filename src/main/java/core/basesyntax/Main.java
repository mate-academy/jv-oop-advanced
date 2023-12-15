package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        int arraySize = 6; // array size
        Figure[] figures = new Figure[arraySize];

        // objects with random parameters
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        // objects with default parameters
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        // information about figures
        for (Figure figure : figures) {
            System.out.println("figure: " + figure.getName() + ", square: "
                    + figure.getArea() + " sq.units., " + figure.getInfo());
        }
    }
}




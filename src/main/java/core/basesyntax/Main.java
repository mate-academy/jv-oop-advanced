package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        // Generate the first half of figures with random parameters
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Generate the second half of figures with fixed parameters
        figures[arraySize / 2] = new Square("red", 5);
        figures[arraySize / 2 + 1] = new Rectangle(3, 7, "green");
        figures[arraySize / 2 + 2] = new Circle(2, "blue");

        // Print the figures
        for (int i = 0; i < arraySize; i++) {
            figures[i].draw();
        }
    }
}

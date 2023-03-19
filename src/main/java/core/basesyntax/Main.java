package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arraySize = 6;
        Figure[] figureArray = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        Circle circle = new Circle("blue", 5);
        circle.name = "circle";
        circle.printInformation();

        ColorSupplier tmp = new ColorSupplier();
        System.out.println(tmp.getRandomColor());

        for (int i = 0; i < arraySize / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = arraySize / 2; i < arraySize; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure currentFigure : figureArray) {
            currentFigure.printInformation();
        }
    }
}

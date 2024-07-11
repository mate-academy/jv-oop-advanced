package core.basesyntax;

public class Application {
    private static final int arrayLenght = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[arrayLenght];

        for (int i = 0; i < arrayLenght / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }

        for (int i = arrayLenght / 2; i < arrayLenght; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figureArray) {
            System.out.println(figure.getFigureData());
        }
    }
}

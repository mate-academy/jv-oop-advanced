package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigures = new FigureSupplier();
        Figure[] array = new Figure[6];
        for (int i = 0; i < 3; i++) {
            array[i] = randomFigures.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            array[i] = randomFigures.getDefaultFigure();
        }
        for (Figure figure : array) {
            figure.areaCalculator();
            figure.informationCalculator();
        }
        // create three balls using class Lottery and print information about them in console
    }
}

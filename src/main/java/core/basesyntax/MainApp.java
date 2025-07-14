package core.basesyntax;

import figures.Figure;
import suppliers.FigureSupplier;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int middleArray = 3;
        final int lengthArray = 6;

        Figure[] arr = new Figure[lengthArray];
        for (int i = 0; i < middleArray; i++) {
            arr[i] = figureSupplier.getRandomFigure();
        }
        for (int i = middleArray; i < lengthArray; i++) {
            arr[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : arr) {
            System.out.println(figure.getInfo());
        }
    }
}

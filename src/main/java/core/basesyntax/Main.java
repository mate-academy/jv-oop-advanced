package core.basesyntax;

import auxiliary.Figure;
import auxiliary.FigureSupplier;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static int randNumberOfArray() {
        int[] array = {3, 6};
        Random random = new Random();
        return array[(random.nextInt(array.length))];
    }

    public static void print(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(figure.getInfo());
        }
    }

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int number = randNumberOfArray();
        Figure[] figure = new Figure[number];
        for (int i = 0; i < number; i++) {
            if (i < number / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefFigure();
            }
        }
        print(figure);
    }
}

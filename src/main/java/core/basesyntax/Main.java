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
            System.out.println(figure.toString());
        }
    }

    public static void main(String[] args) {
        FigureSupplier figureS = new FigureSupplier();
        int number = randNumberOfArray();
        if (number == 3) {
            Figure[] figure = {figureS.getRandomFigure(),
                    figureS.getRandomFigure(),
                    figureS.getDefFigure()};
            print(figure);
        } else {
            Figure[] figure = {figureS.getRandomFigure(), figureS.getRandomFigure(),
                    figureS.getRandomFigure(), figureS.getDefFigure(),
                    figureS.getDefFigure(), figureS.getDefFigure()};
            print(figure);
        }
    }

}

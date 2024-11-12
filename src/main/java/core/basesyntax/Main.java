package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int number = 4;
    static final int numberDifferentFigure = 5;

    public static void main(String[] args) {
        Figure[] array = new Figure[number];
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < number / 2; i++) {
            array[i] = figureSupplier.getRandomFigure(random.nextInt(numberDifferentFigure));
        }
        for (int i = number - 1; i >= number - number / 2; i--) {
           array[i] = figureSupplier.getDefaultFigure();
        }
        for(Figure figure : array) {
            figure.draw();
        }
    }
}

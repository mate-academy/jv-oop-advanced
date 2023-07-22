package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //creating random number of figures to be displayed
        Random random = new Random();
        int figureNumber = random.nextInt(20);

        //creating and printing an array of random figures
        Figure[] figure = new Figure[figureNumber];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = new FigureSupplier().getRandomFigure();
            } else {
                figure[i] = new FigureSupplier().getDefaultFigure();
            }
            System.out.println(figure[i].draw());
        }
    }
}


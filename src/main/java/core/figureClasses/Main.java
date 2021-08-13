package core.figureClasses;

import core.creatorClasses.FigureSupplier;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[5];
        for (int i = 0; i< figuresArray.length; i++) {
            figuresArray[i] = new FigureSupplier().getRandomFigure();
        }

        for (Figure figure: figuresArray) {
            figure.drawing();
        }

    }
}

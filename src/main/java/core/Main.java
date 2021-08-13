package core;

import core.creatorclasses.FigureSupplier;
import core.figureclasses.Figure;
import core.interfaces.Constants;

public class Main implements Constants {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[NUMBER];

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure figure: figuresArray) {
            figure.drawing();
        }

    }
}

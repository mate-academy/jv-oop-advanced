package core;

import core.creatorclasses.FigureSupplier;
import core.figureclasses.Figure;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[new Random().nextInt(6)];

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure figure: figuresArray) {
            figure.draw();
        }
    }
}

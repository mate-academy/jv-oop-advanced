package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int ARRAYLENGTH = 10;

    public static void main(String[] args) {

        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(ARRAYLENGTH)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureGeneration().getFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

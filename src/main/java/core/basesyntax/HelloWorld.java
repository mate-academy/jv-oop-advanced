package core.basesyntax;

import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(20)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new RandomFigure().getFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

package core.basesyntax;

import figures.Figure;
import randomiser.RandomFigure;

public class HelloWorld {
    public static void main(String[] args) {
        RandomFigure randomFigure = new RandomFigure();
        Figure[] figures = randomFigure.getRandomFigures();

        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}

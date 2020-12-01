package core.basesyntax;

import core.basesyntax.figures.FigureGenerator;
import core.basesyntax.figures.Figures;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(100);
        Figures[] figures = new Figures[random];

        for (int i = 0; i < random; i++) {
            figures[i] = FigureGenerator.getRandomFigure();
        }

        for (Figures figure: figures) {
            figure.displayInfo();
        }
    }
}

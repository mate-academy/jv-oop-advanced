package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int LIMIT_NUMBER = 10;

    public static void main(String[] args) {
        FigureGenerator randomFiguresGenerator = new FigureGenerator();
        int figuresArrayLength = new Random().nextInt(LIMIT_NUMBER);
        Figure[] figures = new Figure[figuresArrayLength];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = randomFiguresGenerator.createFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

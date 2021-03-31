package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int LimitNumber = 10;

    public static void main(String[] args) {
        FigureGenerator[] randomFiguresArray =
                new FigureGenerator[new Random().nextInt(LimitNumber)];
        Figure[] figures = new Figure[randomFiguresArray.length];
        for (int i = 0; i < randomFiguresArray.length; i++) {
            figures[i] = FigureGenerator.createFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

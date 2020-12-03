package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FiguresFactory figuresFactory = new FiguresFactory();
        Figure[] figures = new Figure[new Random().nextInt(50) + 1]; // 1 <= figures.length <= 50

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figuresFactory.getFigure(new Random()
                    .nextInt(FiguresFactory.getNumberOfFigures()));
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureMaker figureMaker = new FigureMaker();

        Figure[] figuresArray = new Figure[new Random().nextInt(FiguresList.values().length)];

        for (int i = 0; i < figuresArray.length; i++) {
            figureMaker.getFigure().draw();
        }

    }
}

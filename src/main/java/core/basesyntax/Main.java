package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureGenerator[] randomFiguresArray = new FigureGenerator[new Random().nextInt(10)];
        for (int i = 0; i < randomFiguresArray.length; i++) {
            randomFiguresArray[i] = (FigureGenerator) FigureGenerator.createFigure();
        }
        for (FigureGenerator figure : randomFiguresArray) {
            System.out.println(figure.toString());
        }
    }
}

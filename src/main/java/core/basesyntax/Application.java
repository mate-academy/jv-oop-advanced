package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Figures [] randomArray = new Figures[new Random().nextInt(10)];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = FigureGenerator.getRandomFigure();
        }
        for (Figures print: randomArray) {
            System.out.println(print.toString());
        }
    }
}

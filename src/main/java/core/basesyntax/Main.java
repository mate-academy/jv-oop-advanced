package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureGenerator[] randomArray = new FigureGenerator[new Random().nextInt(10)];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (FigureGenerator) FigureGenerator.createFigure();
        }
        for (FigureGenerator print : randomArray) {
            System.out.println(print.toString());
        }
    }
}

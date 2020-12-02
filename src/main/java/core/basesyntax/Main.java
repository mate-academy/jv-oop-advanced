package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        FigureProducer figureProducer = new FigureProducer();
        int randomNumber = new Random().nextInt(20);
        Figures[] arrayOfFigures = new Figures[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            arrayOfFigures[i] = figureProducer.get();
        }
        for (Figures arrayOfFigure : arrayOfFigures) {
            System.out.println(arrayOfFigure.displayInformation());
        }
    }
}

package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ColorsProducer colorsProducer = new ColorsProducer();

        FigureProducer figureProducer = new FigureProducer(colorsProducer);

        int randomArrayLength = new Random().nextInt(10);

        Figure[] figures = new Figure[randomArrayLength];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureProducer.getFigure();
        }

        drawFigures(figures);
    }

    private static void drawFigures(Figure[] figures) {
        for (Figure figure : figures) {

            System.out.println(figure.draw());
        }
    }
}

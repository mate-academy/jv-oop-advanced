package core.basesyntax;

import core.basesyntax.figures.Shape;

public class Main {

    public static void main(String[] args) {

        drawFigure(FigureProducer.generateFigures(RandomNumber.getRandomNumber(20)));

    }

    public static void drawFigure(Shape[] figures) {
        for (Shape shape: figures) {
            shape.draw();
        }
    }

}

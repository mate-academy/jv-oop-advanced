package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureConstructor figureConstructor = new FigureConstructor();
        Figure[] figuresArray = new Figure[new Random().nextInt(10) + 5];

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureConstructor.getFigure();
        }

        for (Figure figure : figuresArray) {
            System.out.println(figure.drawFigure());
        }
    }
}

package core.basesyntax;

import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figureS = new Figure[new Random().nextInt(100)];
        for (int i = 0; i < figureS.length; i++) {
            figureS[i] = new FigureSupplier().getRandomFigure();
            figureS[i].draw();
        }
    }
}

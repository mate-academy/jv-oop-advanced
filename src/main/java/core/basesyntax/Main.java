package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier(), new Random());
        Figure[] figuresArray = new Figure[6];

        for (int i = 0; i < figuresArray.length; i++) {
            if (i < 3) {
                figuresArray[i] = figureSupplier.getRandomFigure();
                figuresArray[i].draw();
            }else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
                figuresArray[i].draw();
            }
        }
    }
}

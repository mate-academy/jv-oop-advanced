package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figuresArray = new Figure[new Random().nextInt(9)];
        for (int i = 0; i < figuresArray.length; i++) {
            if (figuresArray.length % 2 == 1) {
                figuresArray[i] = (i <= figuresArray.length / 2)
                        ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            } else {
                figuresArray[i] = (i < figuresArray.length / 2)
                        ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            }
        }

        for (Figure unit : figuresArray) {
            System.out.println(unit);
        }
    }
}

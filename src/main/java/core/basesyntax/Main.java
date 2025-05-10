package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int figureArrayCount = new Random().nextInt(20);
        String[] resultArray = new String[figureArrayCount];

        for (int i = 0; i < resultArray.length; i++) {
            FigureSupplier randomFigure = new FigureSupplier();
            Figure resultingFigure = randomFigure.getRandomFigure();
            resultArray[i] = resultingFigure.drawInfo();
            System.out.println(resultArray[i]);
        }

    }
}

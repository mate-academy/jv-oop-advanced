package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //random length for array in range 0 - 20
        int figureArrayCount = new Random().nextInt(20);
        String[] resultArray = new String[figureArrayCount];

        //creating random Figure with random parameters and adding description of each new object to our array,
        //in the end of each iteration printing info
        for (int i = 0; i < resultArray.length; i++) {
            FigureSupplier randomFigure = new FigureSupplier();
            Figure resultingFigure = randomFigure.getRandomFigure();
            resultArray[i] = resultingFigure.toDrawInfo();
            System.out.println(resultArray[i]);
        }

    }
}

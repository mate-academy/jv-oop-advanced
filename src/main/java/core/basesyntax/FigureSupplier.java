package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    Random random = new Random();

    public Figure getRandomFigure(){
        int figureNumber = random.nextInt(FIGURE_COUNT);


    }
    public Figure getDefaultFigure(){

    }
}

